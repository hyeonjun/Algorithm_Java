package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Class3_7576 {

  static int[][] direction = new int[][] {
    {0, 1}, {0, -1}, {1, 0}, {-1, 0}
  };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int m = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());

    int[][] graph = new int[n][m];
    ArrayDeque<int[]> queue = new ArrayDeque<>();
    for (int i=0; i<n; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      for (int j=0; j<m; j++) {
        int x = Integer.parseInt(st.nextToken());
        graph[i][j] = x;
        if (x == 1) queue.add(new int[] {i, j});
      }
    }

    while (!queue.isEmpty()) {
      int[] data = queue.pollFirst();
      int x = data[0], y = data[1];

      for (int[] d : direction) {
        int dx = d[0], dy = d[1];

        int nx = x+dx, ny = y+dy;
        if (0 > nx || nx >= n || 0 > ny || ny >= m) {
          continue;
        }

        if (graph[nx][ny] == 0) {
          queue.add(new int[] {nx, ny});
          graph[nx][ny] = graph[x][y] + 1;
        }
      }
    }

    int result = 0;
    for (int i=0; i<n; i++) {
      for (int j=0; j<m; j++) {
        if (graph[i][j] == 0) {
          System.out.println(-1);
          return;
        }
        result = Math.max(result, graph[i][j]);
      }
    }
    System.out.println(result-1);
  }
}
