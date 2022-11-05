package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Class3_11279 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    PriorityQueue<Integer> queue =
        new PriorityQueue<>(Comparator.comparingInt(x -> -x));

    while (n-- > 0) {
      int x = Integer.parseInt(br.readLine());
      if (x == 0) {
        System.out.println(queue.isEmpty() ? "0" : queue.poll());
      } else queue.add(x);
    }
  }
}
