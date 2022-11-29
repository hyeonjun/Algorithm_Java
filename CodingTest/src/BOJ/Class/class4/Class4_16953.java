package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Class4_16953 {

  static long a, b;
  static Set<Long> visited = new HashSet<>();


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    a = Long.parseLong(st.nextToken());
    b = Long.parseLong(st.nextToken());
    System.out.println(bfs());
  }

  private static long bfs() {
    ArrayDeque<long[]> queue = new ArrayDeque<>();
    queue.add(new long[] {a, 1});
    visited.add(a);

    while(!queue.isEmpty()) {
      long[] data = queue.pollFirst();
      long x = data[0], cnt = data[1];
      if (x == b) {
        return cnt;
      }

      long[] newData = new long[] {x * 2, Long.parseLong(x + "1")};
      for (long nx: newData) {
        if (!visited.contains(nx) && nx <= b) {
          queue.add(new long[] {nx, cnt+1});
          visited.add(nx);
        }
      }
    }

    return -1;
  }
}
