package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Class3_1012 {

  static int[][] direction = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
  static boolean[][] visited;
  static int m, n, k;
  static int[][] arr;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      m=Integer.parseInt(st.nextToken());
      n=Integer.parseInt(st.nextToken());
      k=Integer.parseInt(st.nextToken());
      arr = new int[n][m];
      visited = new boolean[n][m];
      for (int i=0; i<k; i++) {
        st = new StringTokenizer(br.readLine());
        int y=Integer.parseInt(st.nextToken()), x=Integer.parseInt(st.nextToken());
        arr[x][y] = 1;
      }

      int count = 0;
      for (int i=0; i<n; i++) {
        for (int j=0; j<m; j++) {
          if (arr[i][j] == 1 && !visited[i][j]) {
            bfs(i, j);
            count++;
          }
        }
      }
      System.out.println(count);
    }
  }

  static void bfs(int x, int y) {
    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[] {x, y});
    while (!queue.isEmpty()) {
      x = queue.peek()[0];
      y = queue.peek()[1];
      visited[x][y] = true;
      queue.poll();
      for (int i=0; i<4; i++) {
        int dx = direction[i][0];
        int dy = direction[i][1];
        int nx=x+dx, ny=y+dy;

        if (nx >=0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny] && arr[nx][ny] == 1) {
          queue.add(new int[] {nx, ny});
          visited[nx][ny] = true;
        }
      }
    }
  }
}
