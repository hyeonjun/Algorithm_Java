package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Class4_13549 {

  static int n, k;
  static int max = 100001;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());

    System.out.println(bfs());
    System.out.println(dijkstra());
  }

  private static long bfs() {
    ArrayDeque<Integer> queue = new ArrayDeque<>();
    queue.add(n);
    long[] dist = new long[max];
    Arrays.fill(dist, -1L);
    dist[n] = 0;

    while(!queue.isEmpty()) {
      int x = queue.pollFirst();
      if (x == k) {
        return dist[k];
      }

      // 순간이동 가능?
      int y = x * 2;
      if (0 <= y && y < max && dist[y] == -1) {
        dist[y] = dist[x];
        queue.add(y);
      }

      for (int nx : new int[] {x-1, x+1}) {
        if (0 <= nx && nx < max && dist[nx] == -1) {
          dist[nx] = dist[x] + 1;
          queue.add(nx);
        }
      }
    }
    return -1;
  }

  private static long dijkstra() {
    PriorityQueue<Node13549> queue = new PriorityQueue<>();
    queue.offer(new Node13549(0, n));
    long[] distance = new long[max];
    Arrays.fill(distance, Long.MAX_VALUE);
    distance[n] = 0;

    while (!queue.isEmpty()) {
      Node13549 cur = queue.poll();
      int now_n = cur.getNode();
      long now_d = cur.getDist();

      int nx = now_n * 2;
      if (0 <= nx && nx < max && distance[nx] == Long.MAX_VALUE) {
        distance[nx] = distance[now_n];
        queue.offer(new Node13549(distance[nx], nx));
      }
      for (int nxt_n : new int[] {now_n+1, now_n-1}) {
        if (0 <= nxt_n && nxt_n < max && distance[nxt_n] == Long.MAX_VALUE) {
          distance[nxt_n] = now_d + 1;
          queue.offer(new Node13549(distance[nxt_n], nxt_n));
        }
      }
    }

    return distance[k];
  }
}

class Node13549 implements Comparable<Node13549> {
  long dist;
  int node;

  public long getDist() {
    return dist;
  }

  public int getNode() {
    return node;
  }

  public Node13549(long dist, int node) {
    this.dist = dist;
    this.node = node;
  }


  @Override
  public int compareTo(Node13549 o) {
    if (this.dist == o.dist) {
      return this.node - o.node;
    }
    return (int) (dist - o.dist);
  }
}
