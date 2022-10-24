package Class.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Class3_11724 {

  static int[][] graph = new int[1001][1001];
  static int v, e;
  static boolean[] visited = new boolean[1001];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    v = Integer.parseInt(st.nextToken());
    e = Integer.parseInt(st.nextToken());

    for (int i=0; i<e; i++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      graph[x][y] = graph[y][x] = 1;
    }

    int answer = 0;
    for (int i=1; i<v+1; i++) {
      if (!visited[i]) {
//        dfs(i);
        bfs(i);
        answer++;
      }
    }
    System.out.println(answer);
  }

  private static void dfs(int x) {
    visited[x] = true;
    for (int i=1; i<v+1; i++) {
      if (graph[x][i] == 1 && !visited[i]) {
        dfs(i);
      }
    }
  }

  private static void bfs(int x) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(x);
    visited[x] = true;
    while (!queue.isEmpty()) {
      int qx = queue.poll();
      for (int i=1; i<v+1; i++) {
        if (graph[qx][i] == 1 && !visited[i]) {
          visited[i] = true;
          queue.add(i);
        }
      }
    }
  }


}
