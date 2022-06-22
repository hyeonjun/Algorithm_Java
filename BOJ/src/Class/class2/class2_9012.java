package Class.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class class2_9012 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i=0; i<n; i++) {
      String data = br.readLine();
      Stack<Character> stack = new Stack<>();
      boolean flag = true;
      for (int d=0; d<data.length(); d++) {
        char c = data.charAt(d);
        if (c == '(') stack.add(c);
        else if (c == ')') {
          if (stack.empty()) {
            flag = false;
            break;
          }
          else stack.pop();
        }
      }
      if (flag && stack.empty()) sb.append("YES").append("\n");
      else sb.append("NO").append("\n");
    }
    System.out.println(sb);
  }
}
