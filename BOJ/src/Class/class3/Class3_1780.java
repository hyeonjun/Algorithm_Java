package Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class3_1780 {

  static int n, minus=0, one=0, zero=0;
  static int[][] board;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    board = new int[n][n];
    for (int i=0; i<n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j=0; j<n; j++) {
        board[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    divideConquer(0, 0, n);
    System.out.println(minus+"\n"+zero+"\n"+one);

  }

  private static void divideConquer(int r, int c, int size) {
    if (check(r, c, size)) {
      switch (board[r][c]) {
        case 0:
          zero++;
          break;
        case 1:
          one++;
          break;
        case -1:
          minus++;
          break;
      }
      return;
    }

    int divide = size / 3;
    for (int i=r; i<r+size; i+=divide) {
      for (int j=c; j<c+size; j+=divide) {
        divideConquer(i, j, divide);
      }
    }
  }

  private static boolean check(int r, int c, int size) {
    for (int i=r; i<r+size; i++) {
      for (int j=c; j<c+size; j++) {
        if (board[r][c] != board[i][j]) {
          return false;
        }
      }
    }
    return true;
  }

}
