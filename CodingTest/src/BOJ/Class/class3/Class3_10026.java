package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Set;

public class Class3_10026 {

  static String[][] board;
  static boolean[][] visited;
  static int n;
  static int[][] direction = new int[][] {
    {0, 1}, {0, -1}, {1, 0}, {-1, 0}
  };

  static Set<String> redGreenSet = Set.of("R", "G");

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());

    board = new String[n][n];

    for (int i=0; i<n; i++) {
      String[] tmp = br.readLine().split("");
      System.arraycopy(tmp, 0, board[i], 0, n);
    }

    System.out.println(start(false)+" "+start(true));
  }

  private static int start(boolean redGreenColor) {
    visited = new boolean[n][n];
    int result = 0;
    for (int i=0; i<n; i++) {
      for (int j=0; j<n; j++) {
        if (!visited[i][j]) {
          bfs(i, j, redGreenColor);
          result++;
        }
      }
    }

    return result;
  }

  private static void bfs(int x, int y, boolean redGreenColor) {
    ArrayDeque<int[]> queue = new ArrayDeque<>();
    queue.add(new int[] {x, y});
    visited[x][y] = true;

    while(!queue.isEmpty()) {
      int[] data = queue.pollFirst();
      x = data[0];
      y = data[1];

      for (int[] d: direction) {
        int dx=d[0], dy=d[1];

        int nx = x+dx, ny = y+dy;
        if (0 > nx || nx >= n || 0 > ny || ny >= n || visited[nx][ny]) {
          continue;
        }

        if (board[x][y].equals(board[nx][ny]) ||
          (redGreenColor && isRedGreen(x, y, nx, ny))) {
          queue.add(new int[] {nx, ny});
          visited[nx][ny] = true;
        }
      }
    }
  }

  private static boolean isRedGreen(int x, int y, int nx, int ny) {
    if (redGreenSet.contains(board[x][y]) && redGreenSet.contains(board[nx][ny])) {
      return true;
    }
    return false;
  }

}
