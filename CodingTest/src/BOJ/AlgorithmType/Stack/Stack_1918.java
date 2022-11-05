package BOJ.AlgorithmType.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_1918 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String str = br.readLine();

    Stack<Character> stack = new Stack<>();

    for (int i=0; i<str.length(); i++) {
      char now = str.charAt(i);

      switch (now) {
        case '+': case '-': case '*': case '/':
          while (!stack.isEmpty() && priority(stack.peek()) >= priority(now)) {
            sb.append(stack.pop());
          }
          stack.add(now);
          break;
        case '(':
          stack.add(now);
          break;
        case ')':
          while (!stack.isEmpty() && stack.peek() != '(') {
            sb.append(stack.pop());
          }
          stack.pop(); // '(' 제거
          break;
        default:
          sb.append(now);
      }
    }

    while (!stack.isEmpty()) {
      sb.append(stack.pop());
    }

    System.out.println(sb);

  }

  private static int priority(char op) {
    if (op == '(' || op == ')') {
      return 0;
    } else if (op == '+' || op == '-') {
      return 1;
    }
    return 2;
  }

}
