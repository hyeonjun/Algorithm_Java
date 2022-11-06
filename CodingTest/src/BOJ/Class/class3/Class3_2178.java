package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Class3_2178 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    String[] board = new String[n];
    for (int i=0; i<n; i++) {
      board[i] = br.readLine();
    }

    int[][] direction = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    int[][] visited = new int[n][m];
    visited[0][0] = 1;

    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[] {0, 0});
    while(!queue.isEmpty()) {
      int[] position = queue.poll();
      int x = position[0];
      int y = position[1];
      for (int i=0; i<4; i++) {
        int dx = direction[i][0];
        int dy = direction[i][1];
        int nx = x+dx;
        int ny = y+dy;

        if (nx >= 0 && nx < n && ny >= 0 && ny < m && visited[nx][ny] == 0 && board[nx].charAt(ny) == '1') {
          queue.add(new int[] {nx, ny});
          visited[nx][ny] = visited[x][y] + 1;
        }
      }
    }
    System.out.println(visited[n-1][m-1]);

  }
}
