package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Class3_2667 {

  static int[][] board;
  static boolean[][] visited;
  static int n;
  static int[][] direction = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    board = new int[n][n];
    visited = new boolean[n][n];

    for (int i=0; i<n; i++) {
      String[] tmp = br.readLine().split("");
      for (int j=0; j<n; j++) {
        board[i][j] = Integer.parseInt(tmp[j]);
      }
    }

    List<Integer> answer = new ArrayList<>();

    for (int i=0; i<n; i++) {
      for (int j=0; j<n; j++) {
        if (!visited[i][j] && board[i][j] == 1) {
          answer.add(bfs(i, j));
        }
      }
    }

    System.out.println(answer.size());
    answer.stream()
      .sorted().forEach(System.out::println);

  }

  private static int bfs(int x, int y) {
    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[] {x, y});
    int count = 1;
    visited[x][y] = true;

    while (!queue.isEmpty()) {
      int[] position = queue.poll();
      x = position[0];
      y = position[1];
      for (int i=0; i<4; i++) {
        int dx = direction[i][0];
        int dy = direction[i][1];
        int nx = x+dx, ny = y+dy;

        if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny] && board[nx][ny] == 1) {
          queue.add(new int[] {nx, ny});
          visited[nx][ny] = true;
          count++;
        }
      }
    }

    return count;
  }
}
