package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class4_9663 {

  static int n;
  static int[] queen;
  static boolean[] visited;
  static int result = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());

    queen = new int[n];
    visited = new boolean[n];

    dfs(0);
    System.out.println(result);
  }

  private static boolean check(int row) {
    for (int i=0; i<row; i++) {
      if (queen[i] == queen[row] || Math.abs(queen[row]-queen[i]) == row - i) {
        return false;
      }
    }
    return true;
  }

  private static void dfs(int row) {
    if (row == n) {
      result++;
    } else {
      for (int i=0; i<n; i++) {
        if (visited[i]) continue;
        queen[row] = i;
        if (check(row)) {
          visited[i] = true;
          dfs(row+1);
          visited[i] = false;
        }
      }
    }
  }
}
