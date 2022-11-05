package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Class3_1260 {

  static StringBuilder sb = new StringBuilder();
  static boolean[] visited;
  static int[][] graph;
  static int n, m, v;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n=Integer.parseInt(st.nextToken());
    m=Integer.parseInt(st.nextToken());
    v=Integer.parseInt(st.nextToken());

    graph = new int[n+1][n+1];
    for (int i=0; i<m; i++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
      graph[x][y] = graph[y][x] = 1;
    }

    visited = new boolean[n+1];
    dfs(v);
    sb.append("\n");

    visited = new boolean[n+1];
    bfs(v);

    System.out.println(sb);
  }

  public static void bfs(int start) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(start);
    visited[start] = true;

    while(!queue.isEmpty()) {
      int x = queue.poll();
      sb.append(x).append(" ");

      for (int i=1; i<=n; i++) {
        if (graph[x][i] == 1 && !visited[i]) {
          visited[i] = true;
          queue.add(i);
        }
      }
    }
  }

  public static void dfs(int start) {
    visited[start] = true;
    sb.append(start).append(" ");

    for (int i=1; i<=n; i++) {
      if (graph[start][i] == 1 && !visited[i]) {
        dfs(i);
      }
    }
  }

}
