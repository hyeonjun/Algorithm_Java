package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Class4_1504 {

  static int n, e;
  static ArrayList<ArrayList<Node>> graph;
  static int max = 200000000;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    e = Integer.parseInt(st.nextToken());

    graph = new ArrayList<>();
    for (int i=0; i<n+1; i++) {
      graph.add(new ArrayList<>());
    }

    for (int i=0; i<e; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());

      graph.get(a).add(new Node(c, b));
      graph.get(b).add(new Node(c, a));
    }

    st = new StringTokenizer(br.readLine());
    int v1 = Integer.parseInt(st.nextToken()), v2 = Integer.parseInt(st.nextToken());

    int[] startDistance = dijkstra(1);
    int[] v1Distance = dijkstra(v1);
    int[] v2Distance = dijkstra(v2);

    int result = Math.min(
      startDistance[v1]+v1Distance[v2]+v2Distance[n],
      startDistance[v2]+v2Distance[v1]+v1Distance[n]);
    System.out.println(result < max ? result : -1);
  }

  private static int[] dijkstra(int start) {
    PriorityQueue<Node> queue = new PriorityQueue<>();
    queue.offer(new Node(0, start));
    int[] distance = new int[n+1];
    Arrays.fill(distance, max);
    distance[start] = 0;

    while (!queue.isEmpty()) {
      Node now = queue.poll();
      int now_d = now.getDist();
      int now_n = now.getNode();

      if (distance[now_n] < now_d) continue;
      for (Node nxt: graph.get(now_n)) {
        int nxt_d = nxt.getDist();
        int nxt_n = nxt.getNode();
        nxt_d += now_d;
        if (nxt_d < distance[nxt_n]) {
          distance[nxt_n] = nxt_d;
          queue.offer(new Node(nxt_d, nxt_n));
        }
      }
    }
    return distance;
  }
}

class Node implements Comparable<Node> {
  int dist;
  int node;

  public int getDist() {
    return dist;
  }

  public int getNode() {
    return node;
  }

  public Node(int dist, int node) {
    this.dist = dist;
    this.node = node;
  }

  @Override
  public int compareTo(Node o) {
    if (this.dist == o.dist) {
      return this.node - o.node;
    }
    return this.dist - o.dist;
  }
}