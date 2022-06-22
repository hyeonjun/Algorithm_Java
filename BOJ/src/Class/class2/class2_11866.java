package Class.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class class2_11866 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());

    solution_queue(n, k);
    solution_linkedList(n, k);
  }

  static void solution_queue(int n, int k) {
    Queue<Integer> queue = new LinkedList<>();
    for (int i=1; i<n+1; i++) queue.add(i);

    StringBuilder sb = new StringBuilder();
    sb.append("<");

    while (queue.size() > 1) {
      // k-1번 앞에 있는 원소들을 뒤로 다시 보냄
      for (int i=0; i<k-1; i++) queue.offer(queue.poll());
      // k번째 수를 꺼냄
      sb.append(queue.poll()).append(", ");
    }

    sb.append(queue.poll()).append(">");
    System.out.println(sb);
  }

  static void solution_linkedList(int n, int k) {
    LinkedList<Integer> list = new LinkedList<>();
    for (int i=1; i<n+1; i++) list.add(i);

    StringBuilder sb = new StringBuilder();
    sb.append("<");

    int idx = 0; // 삭제할 요소 인덱스

    while (n > 1) {
      idx = (idx + (k-1)) % n;
      sb.append(list.remove(idx)).append(", ");
      n--;
    }

    sb.append(list.remove()).append(">");
    System.out.println(sb);
  }
}
