package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Class3_2606 {

  static boolean[] visited;
  static ArrayList<Integer>[] board;
  static Queue<Integer> queue = new LinkedList<>();
  static int n, m;
  static int answer = 0;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    n = Integer.parseInt(br.readLine());
    m = Integer.parseInt(br.readLine());

    board = new ArrayList[n+1];
    for (int i=0; i<n+1; i++) board[i] = new ArrayList<>();
    visited = new boolean[n+1];

    for (int i=0; i<m; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      int x=Integer.parseInt(st.nextToken()), y=Integer.parseInt(st.nextToken());
      board[x].add(y);
      board[y].add(x);
    }

    System.out.println(dfs(1));
    answer = 0;
    visited = new boolean[n+1];
    System.out.println(bfs(1));
  }

  static int dfs(int x) {
    visited[x] = true;
    for (int nx : board[x]) {
      if (!visited[nx]) {
        answer++;
        dfs(nx);
      }
    }
    return answer;
  }

  static int bfs(int start) {
    queue.offer(start);
    visited[start] = true;
    while (!queue.isEmpty()) {
      int x = queue.poll();
      for (int nx : board[x]) {
        if (!visited[nx]) {
          queue.offer(nx);
          answer++;
          visited[nx] = true;
        }
      }
    }
    return answer;
  }
}
