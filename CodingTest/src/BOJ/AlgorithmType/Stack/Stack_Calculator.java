package BOJ.AlgorithmType.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.Stack;

public class Stack_Calculator {

  static final Set<String> operator = Set.of("*", "/", "-", "+");

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] infix = br.readLine().split("");
    String[] postfix = postfixConverter(infix);
    System.out.println(calculator(postfix));
  }

  private static double calculator(String[] postfix) {
    Stack<Double> stack = new Stack<>();
    double result;
    for (String op : postfix) {
      if (operator.contains(op)) { // 연산자인 경우 계산
        double x = stack.pop();
        double y = stack.pop();
        switch (op) {
          case "*":
            result = y * x;
            break;
          case "/":
            result = y / x;
            break;
          case "+":
            result = y + x;
            break;
          default:
            result = y - x;
            break;
        }
        stack.add(result);
      } else { // 숫자
        try {
          stack.add(Double.parseDouble(op));
        } catch (Exception e) {
          throw new RuntimeException("잘못된 수식입니다.");
        }
      }
    }

    return stack.pop();
  }

  private static String[] postfixConverter(String[] infix) {
    StringBuilder sb = new StringBuilder();
    Stack<String> stack = new Stack<>();

    try {
      for (String now : infix) {
        if (operator.contains(now)) {
          while (!stack.isEmpty() && priority(stack.peek()) >= priority(now)) {
            sb.append(stack.pop());
          }
          stack.add(now);
        } else if (now.equals("(")) {
          stack.add(now);
        } else if (now.equals(")")) {
          while (!stack.isEmpty() && !stack.peek().equals("(")) {
            sb.append(stack.pop());
          }
          stack.pop();
        } else {
          sb.append(now);
        }
      }
    } catch (Exception e) {
      throw new RuntimeException("잘못된 수식입니다.");
    }


    while(!stack.isEmpty())
      sb.append(stack.pop());

    return sb.toString().split("");
  }

  private static int priority(String op) {
    if (op.equals("(") || op.equals(")")) {
      return 0;
    } else if (op.equals("+") || op.equals("-")) {
      return 1;
    }
    return 2;
  }
}
