package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Class4_1916 {

  static int n, m;
  static ArrayList<ArrayList<Node1916>> graph;
  static int start, end;


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    m = Integer.parseInt(br.readLine());

    graph = new ArrayList<>();
    for (int i=0; i<n+1; i++) {
      graph.add(new ArrayList<>());
    }

    StringTokenizer st;
    for (int i=0; i<m; i++) {
      st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken());
      int e = Integer.parseInt(st.nextToken());
      int d = Integer.parseInt(st.nextToken());

      graph.get(s).add(new Node1916(e, d));
    }

    st = new StringTokenizer(br.readLine());
    start = Integer.parseInt(st.nextToken());
    end = Integer.parseInt(st.nextToken());

    System.out.println(dijkstra());
  }

  private static int dijkstra() {
    PriorityQueue<Node1916> pq = new PriorityQueue<>();
    pq.offer(new Node1916(start, 0));
    int[] distance = new int[n+1];
    Arrays.fill(distance, Integer.MAX_VALUE);
    distance[start] = 0;

    while (!pq.isEmpty()) {
      Node1916 cur = pq.poll();
      int now_d = cur.getWeight();
      int now_n = cur.getEnd();

      if (distance[now_n] < now_d) continue;
      for (Node1916 nxt : graph.get(now_n)) {
        int nxt_n = nxt.getEnd();
        int nxt_d = nxt.getWeight();
        nxt_d += now_d;
        if (nxt_d < distance[nxt_n]) {
          distance[nxt_n] = nxt_d;
          pq.offer(new Node1916(nxt_n, nxt_d));
        }
      }
    }

    return distance[end];
  }
}

class Node1916 implements Comparable<Node1916> {
  int end;
  int weight;

  public int getEnd() {
    return end;
  }

  public int getWeight() {
    return weight;
  }

  public Node1916(int end, int weight) {
    this.end = end;
    this.weight = weight;
  }

  @Override
  public int compareTo(Node1916 o) {
    return weight - o.weight;
  }
}

