package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class3_1992 {
  static String[] quadTree;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    quadTree = new String[n];
    for (int i=0; i<n; i++) {
      quadTree[i] = br.readLine();
    }

    String result = compression(0, 0, n);

    System.out.println(result);
  }

  private static String compression(int row, int col, int n) {
    if (n == 1) {
      return String.valueOf(quadTree[row].charAt(col));
    }

    StringBuilder temp = new StringBuilder();
    for (int i=row; i<row+n; i++) {
      for (int j=col; j<col+n; j++) {
        // 같지 않으면 사분면 안으로
        if (quadTree[row].charAt(col) != quadTree[i].charAt(j)) {
          temp.append("(");

          temp.append(compression(row, col, n/2)); // 왼쪽 위
          temp.append(compression(row, col+n/2, n/2)); // 오른쪽 위
          temp.append(compression(row+n/2, col, n/2)); // 왼쪽 아래
          temp.append(compression(row+n/2, col+n/2, n/2)); // 오른쪽 아래

          temp.append(")");
          return temp.toString();
        }
      }
    }
    return String.valueOf(quadTree[row].charAt(col));
  }
}