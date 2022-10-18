package Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class3_2630 {

  static int n, white=0, blue=0;
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
    divedeConquer(0, 0, n);
    System.out.println(white+"\n"+blue);
  }

  private static void divedeConquer(int r, int c, int size) {
    if (check(r, c, size)) {
      if (board[r][c] == 1) blue++;
      else white++;
      return;
    }
    int divide = size / 2;
    for (int i=r; i<r+size; i+=divide) {
      for (int j=c; j<c+size; j+=divide) {
        divedeConquer(i, j, divide);
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
