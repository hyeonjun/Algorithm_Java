package woowacource.precourse;

import java.util.Arrays;

public class Problem5 {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(50237))); // [1, 0, 0, 0, 0, 2, 0, 3, 7]
    System.out.println(Arrays.toString(solution(15000))); // [0, 1, 1, 0, 0, 0, 0, 0, 0]

  }

  public static int[] solution(int money) {

    int[] answer = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] op = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
    for (int i=0; i<9; i++) {
      answer[i] = money / op[i];
      money %= op[i];
    }

    System.out.println(Arrays.toString(op));

    return answer;
  }
}
