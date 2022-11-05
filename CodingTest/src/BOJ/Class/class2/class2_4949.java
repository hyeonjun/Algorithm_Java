package BOJ.Class.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class class2_4949 {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
    StringBuilder sb = new StringBuilder();
    String data;
    while (true) {
      data = br.readLine();
      if (data.equals(".")) break;
      Stack<Character> stack = new Stack<>();
      boolean flag = true;
      for (int i=0; i<data.length(); i++) {
        char c = data.charAt(i);

        if (c == '(' || c == '[') stack.push(c);
        else if (c == ')' || c == ']') {
          if (stack.empty()) {
            flag = false;
            break;
          }
          char nxt = stack.pop();
          if ((c == ']' && nxt != '[') || (c == ')' && nxt != '(')) {
            flag = false;
            break;
          }
        }
      }

      if (stack.empty() && flag) sb.append("yes").append("\n");
      else sb.append("no").append("\n");
    }
    System.out.println(sb);
  }
}
