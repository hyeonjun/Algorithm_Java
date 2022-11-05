package naverwebtoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int[] nums = new int[n];
    for(int i=0; i<n; i++) nums[i] = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int m = Integer.parseInt(st.nextToken());
    String[] ops = new String[m];
    for(int i=0; i<m; i++) ops[i] = st.nextToken();

    Stack<String> stack = new Stack();

    for (String op: ops) {
      if (stack.isEmpty()) {
        stack.push(op);
      } else {
        if (compare(stack.peek()) && !compare(op)) { // 현재 연산자가 이전 연산자보다 우선 순위가 낮을 때
          while(true) {

          }
        }  else { // 우선 순위가 높음
          stack.push(op);
        }
      }
    }

  }

  static boolean compare(String op) {
    if (op.equals("*") || op.equals("/"))
      return true;
    return false;
  }

}
