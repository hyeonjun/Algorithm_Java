package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Class4_11725 {

  static int n;
  static ArrayList<ArrayList<Integer>> tree;
  static int[] parents;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());

    tree = new ArrayList<>();
    for (int i=0; i<n+1; i++) {
      tree.add(new ArrayList<>());
    }

    StringTokenizer st;
    for (int i=0; i<n-1; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      tree.get(a).add(b);
      tree.get(b).add(a);
    }

    parents = new int[n+1];

    dfs(1);
    Arrays.stream(parents).skip(2).forEach(System.out::println);

    parents = new int[n+1];

    bfs(1);
    Arrays.stream(parents).skip(2).forEach(System.out::println);

  }

  private static void dfs(int start) {
    for (int x : tree.get(start)) {
      if (parents[x] == 0) { // 아직 부모 안찾음
        parents[x] = start;
        dfs(x);
      }
    }
  }

  private static void bfs(int start) {
    ArrayDeque<Integer> queue = new ArrayDeque<>();
    queue.add(start);
    while (!queue.isEmpty()) {
      int x = queue.pollFirst();
      for (int nx : tree.get(x)) {
        if (parents[nx] == 0) {
          parents[nx] = x;
          queue.add(nx);
        }
      }
    }
  }
}