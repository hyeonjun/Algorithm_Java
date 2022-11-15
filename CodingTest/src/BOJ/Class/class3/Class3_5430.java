package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Class3_5430 {

  static StringBuilder sb = new StringBuilder();
  static ArrayDeque<Integer> deque;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());


    StringTokenizer st;

    while (t-- > 0) {
      String p = br.readLine();
      int n = Integer.parseInt(br.readLine());
      st = new StringTokenizer(br.readLine(), "[],");

      deque = new ArrayDeque<>();
      while (st.hasMoreTokens()) {
        deque.add(Integer.parseInt(st.nextToken()));
      }

      AC(p);
    }
    System.out.println(sb);
  }

  private static void AC(String P) {
    boolean reversed = false;

    for (char p : P.toCharArray()) {
      if (p == 'R') {
        reversed = !reversed;
        continue;
      }

      if (dequePoll(reversed) == null) {
        sb.append("error\n");
        return;
      }
    }

    sb.append("[");

    if (!deque.isEmpty()) {
      sb.append(dequePoll(reversed));
      while(!deque.isEmpty()) {
        sb.append(",").append(dequePoll(reversed));
      }
    }

    sb.append("]\n");
  }

  private static Integer dequePoll(boolean reversed) {
    if (!reversed) {
      return deque.pollFirst();
    } return deque.pollLast();
  }

}
