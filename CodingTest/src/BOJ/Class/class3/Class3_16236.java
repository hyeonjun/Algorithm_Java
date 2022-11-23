package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Class3_16236 {
  static int n;
  static int[][] board;
  static int sx, sy;

  static int exp = 0;

  // 상하좌우
  static int[] dx = {1,-1,0,0};
  static int[] dy = {0,0,1,-1};

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    board = new int[n][n];

    StringTokenizer st;
    for (int i=0; i<n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j=0; j<n; j++) {
        int x = Integer.parseInt(st.nextToken());
        if (x == 9) {
          sx = i; sy = j;
          board[i][j] = 2;
        } else {
          board[i][j] = x;
        }
      }
    }

    int time = 0;

    while (true) {
      int[] data = bfs(); // nx, ny, 거리
      if (data[0] == -1) {
        break;
      }

      move(data[0], data[1]);
      sx=data[0]; sy=data[1];
      exp += 1;
      if (exp == board[sx][sy]) {
        board[sx][sy] += 1;
        exp = 0;
      }
      time += data[2];
    }
    System.out.println(time);
  }

  private static void move(int nx, int ny) {
    board[nx][ny] = board[sx][sy];
    board[sx][sy] = 0;
  }

  private static int[] bfs() {
    ArrayDeque<int[]> queue = new ArrayDeque<>();
    queue.add(new int[] {sx, sy});

    boolean[][] visited = new boolean[n][n];
    visited[sx][sy] = true;

    List<int[]> eat = new ArrayList<>();
    int[][] distance = new int[n][n];

    while (!queue.isEmpty()) {
      int[] data = queue.pollFirst();
      int x=data[0], y=data[1];

      for (int i=0; i<4; i++) {
        int nx = x+dx[i], ny = y+dy[i];
        if (nx < 0 || nx >= n || ny < 0 || ny >= n || visited[nx][ny]) continue;
        if (board[sx][sy] >= board[nx][ny]) { // 상어의 크기가 물보기보다 크거가 같으면
          queue.add(new int[] {nx, ny});
          visited[nx][ny] = true;
          distance[nx][ny] = distance[x][y] + 1;
        }
        if (board[nx][ny] > 0 && board[nx][ny] < board[sx][sy]) {
          eat.add(new int[] {nx, ny, distance[nx][ny]});
        }
      }
    }

    if (eat.isEmpty()) { // 더 이상 먹을 수 있는 물고기가 없음
      return new int[] {-1, -1, -1};
    }

    eat.sort((o1, o2) -> {
      if (o1[2] == o2[2]) {
        if (o1[0] == o2[0]) {
          return o1[1] - o2[1];
        }
        return o1[0] - o2[0];
      }
      return o1[2] - o2[2];
    });

    return eat.get(0);
  }

}
