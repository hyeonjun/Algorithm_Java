package Class.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class class2_10773 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Deque<Integer> deque = new ArrayDeque<>();
    for (int i=0; i<n; i++) {
      int x = Integer.parseInt(br.readLine());
      if (x == 0) deque.pollLast(); // 덱의 마지막 쪽에서 엘리먼트 하나를 뽑아 제거한 다음 해당 엘리먼트를 리턴, 덱이 비어이으면 null이 리턴된다
      else deque.add(x);
    }

    // Stream reduce 를 이용하여 sum
    System.out.println(deque.stream().reduce(0, Integer::sum));

    // IntStream 의 sum
    System.out.println(deque.stream().mapToInt(i -> i).sum());
  }
}
