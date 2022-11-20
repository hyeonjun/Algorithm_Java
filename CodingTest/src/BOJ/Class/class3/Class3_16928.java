package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Class3_16928 {

  static Map<Integer, Integer> jump = new HashMap<>();
  static int[] board = new int[101];
  static boolean[] visited = new boolean[101];

  public static void main(String[] args) throws IOException  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

    for (int i=0; i<n+m; i++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
      jump.put(x, y);
    }

    bfs();
    System.out.println(board[100]);
  }

  private static void bfs() {
    ArrayDeque<Integer> queue = new ArrayDeque<>();
    queue.add(1);
    visited[1] = true;

    while(!queue.isEmpty()) {
      int x = queue.pollFirst();
      for (int dx=1; dx<7; dx++) {
        int nx = x+dx;
        if (nx > 100 || visited[nx]) {
          continue;
        }
        nx = jump.getOrDefault(nx, nx);
        if (!visited[nx]) {
          queue.add(nx);
          visited[nx] = true;
          board[nx] = board[x] + 1;
        }
      }
    }
  }
}