package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Class3_11286 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
      int abs1 = Math.abs(o1), abs2 = Math.abs(o2);

      if (abs1 == abs2) return o1 > o2 ? 1 : -1;
      return abs1 - abs2;
    });

    for (int i=0; i<n; i++) {
      int x = Integer.parseInt(br.readLine());
      if (x == 0) {
        System.out.println(queue.isEmpty() ? "0" : queue.poll());
      } else queue.add(x);
    }
  }
}
