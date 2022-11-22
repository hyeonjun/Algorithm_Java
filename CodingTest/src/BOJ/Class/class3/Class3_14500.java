package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class3_14500 {

  static int max = Integer.MIN_VALUE;
  static int[][] board;
  static boolean[][] visited;
  static int n;
  static int m;

  // 상하좌우
  static int[] dx = {-1,1,0,0};
  static int[] dy = {0,0,-1,1};

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n=Integer.parseInt(st.nextToken());
    m=Integer.parseInt(st.nextToken());

    board = new int[n][m];
    visited = new boolean[n][m];

    for (int i=0; i<n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j=0; j<m; j++) {
        board[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for (int i=0; i<n; i++) {
      for (int j=0; j<m; j++) {
        visited[i][j] = true;
        dfs(i, j, board[i][j], 1);
        visited[i][j] = false;
      }
    }
    System.out.println(max);
  }

  static void dfs(int x, int y, int sum, int count) {
    if (count == 4) {
      max = Math.max(max, sum);
      return;
    }

    for (int i=0; i<4; i++) {
      int nx = x+dx[i], ny = y+dy[i];

      if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
        continue;
      }

      if (!visited[nx][ny]) {
        visited[nx][ny] = true;
        // ㅜ 모양 만들기 위해 2번째 칸에서 한번더 탐색: 특별한 경우
        if (count == 2) {
          dfs(x, y, sum+board[nx][ny], count+1);
        }

        dfs(nx, ny, sum+board[nx][ny], count+1);
        visited[nx][ny] = false;
      }
    }
  }
}
