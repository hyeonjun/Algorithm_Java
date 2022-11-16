package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Class3_7569 {

  static int[][] direction = new int[][] {
    {-1, 0, 0}, {1, 0, 0}, {0, 1, 0}, {0, -1, 0}, {0, 0, 1}, {0, 0, -1}
  };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int m = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    int h = Integer.parseInt(st.nextToken());

    int[][][] graph = new int[h][n][m];
    ArrayDeque<int[]> queue = new ArrayDeque<>();
    for (int i=0; i<h; i++) {
      for (int j=0; j<n; j++) {
        st = new StringTokenizer(br.readLine(), " ");
        for (int k=0; k<m; k++) {
          int x = Integer.parseInt(st.nextToken());
          graph[i][j][k] = x;
          if (x == 1) {
            queue.add(new int[] {i, j, k});
          }
        }
      }
    }

    while (!queue.isEmpty()) {
      int[] data = queue.pollFirst();
      int x = data[0];
      int y = data[1];
      int z = data[2];

      for (int[] d : direction) {
        int dx = d[0];
        int dy = d[1];
        int dz = d[2];

        int nx = x + dx, ny = y + dy, nz = z + dz;
        if (0 > nx || nx >= h || 0 > ny || ny >= n || 0 > nz || nz >= m) {
          continue;
        }
        if (graph[nx][ny][nz] == 0) {
          queue.add(new int[] {nx, ny, nz});
          graph[nx][ny][nz] = graph[x][y][z] + 1;
        }
      }
    }

    int result = 0;
    for (int i=0; i<h; i++) {
      for (int j=0; j<n; j++) {
        for (int k=0; k<m; k++) {
          if (graph[i][j][k] == 0) {
            System.out.print(-1);
            return;
          }
          result = Math.max(result, graph[i][j][k]);
        }
      }
    }
    System.out.println(result-1);
  }
}
