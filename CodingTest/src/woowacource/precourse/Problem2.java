package woowacource.precourse;

import java.util.Stack;

public class Problem2 {

  public static void main(String[] args) {
    String result1 = solution("browoanoommnaon");
    System.out.println(result1); // "brown"

    String result2 = solution("zyelleyz");
    System.out.println(result2); // ""
  }

  public static String solution(String cryptogram) {
    Stack<String> stack = new Stack<>();

    String[] cryptogramList = cryptogram.split("");
    for (String c : cryptogramList) {
      if (!stack.isEmpty() && stack.peek().equals(c)) {
        stack.pop();
      } else {
        stack.add(c);
      }
    }
    return String.join("", stack);
  }
}
