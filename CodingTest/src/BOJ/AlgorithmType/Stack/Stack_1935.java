package BOJ.AlgorithmType.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Stack_1935 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    String[] operation = br.readLine().split("");
    Set<String> op = Set.of("*", "-", "+", "/");
    Map<String, String> map = new HashMap<>();

    for (int i=0; i<n; i++) {
      String num = br.readLine();
      char x = (char) (i+65);
      map.put(String.valueOf(x), num);
    }

    for (int i=0; i< operation.length; i++) {
      if (map.containsKey(operation[i])) {
        operation[i] = map.get(operation[i]);
      }
    }

    Stack<Double> stack = new Stack<>();

    for (String s : operation) {
      if (op.contains(s)) { // 연산자
        double x = stack.pop();
        double y = stack.pop();
        double result = 0;
        switch (s) {
          case "*":
            result = y * x;
            break;
          case "/":
            result = y / x;
            break;
          case "+":
            result = y + x;
            break;
          case "-":
            result = y - x;
            break;
        }
        stack.add(result);
      } else {
        stack.add(Double.parseDouble(s));
      }
    }

    System.out.println(String.format("%.2f", stack.pop()));

  }

}
