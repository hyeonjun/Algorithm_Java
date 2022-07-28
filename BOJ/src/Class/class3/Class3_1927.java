package Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Class3_1927 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(x -> x));
    for (int i=0; i<n; i++) {
      int x = Integer.parseInt(br.readLine());
      queue.add(x);
    }
  }
}
