package BOJ.Class.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class class2_10828 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st;
    Deque<String> stack = new ArrayDeque<>();
    StringBuilder sb = new StringBuilder();
    for (int i=0; i<n; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      String cmd = st.nextToken();
      switch (cmd) {
        case "push":
          stack.add(st.nextToken());
          break;
        case "pop":
          if (stack.isEmpty())
            sb.append("-1").append("\n");
          else
            sb.append(stack.pollLast()).append("\n");
          break;
        case "size":
          sb.append(stack.size()).append("\n");
          break;
        case "empty":
          sb.append(stack.isEmpty() ? "1" : "0").append("\n");
          break;
        default:
          if (stack.isEmpty())
            sb.append("-1").append("\n");
          else
            sb.append(stack.getLast()).append("\n");
          break;
      }
    }
    System.out.println(sb);
  }
}
