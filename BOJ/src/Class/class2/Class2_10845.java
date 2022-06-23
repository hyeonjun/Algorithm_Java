package Class.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Class2_10845 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st;
    Deque<String> queue = new ArrayDeque<>();
    StringBuilder sb = new StringBuilder();
    for (int i=0; i<n; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      String cmd = st.nextToken();
      switch (cmd) {
        case "push":
          queue.add(st.nextToken());
          break;
        case "pop":
          if (queue.isEmpty())
            sb.append("-1").append("\n");
          else
            sb.append(queue.pollFirst()).append("\n");
          break;
        case "size":
          sb.append(queue.size()).append("\n");
          break;
        case "empty":
          sb.append(queue.isEmpty() ? "1" : "0").append("\n");
          break;
        default:
          if (queue.isEmpty())
            sb.append("-1").append("\n");
          else if (cmd.equals("front"))
            sb.append(queue.getFirst()).append("\n");
          else
            sb.append(queue.getLast()).append("\n");
          break;
      }
    }
    System.out.println(sb);
  }
}
