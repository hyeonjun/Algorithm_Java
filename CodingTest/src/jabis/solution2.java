package jabis;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class solution2 {

  public static void main(String[] args) {
//    int[][] orders = {{2, 3, 4, 0, 1}, {1, 4, 3, 2, 0}, {4, 1, 0, 2, 3}, {3, 2, 1, 4, 0}, {0, 3, 2, 1, 4}};
    int[][] orders = {{2, 1, 0, 3}, {3, 2, 0, 1}, {3, 0, 2, 1}, {2, 3, 0, 1}};
    System.out.println(Arrays.toString(solution(orders)));
  }

  public static int[] solution(int[][] orders) {
    int length = orders.length;
    int count = 0;
    int[] answer = {0, 0};
    int boundary = length % 2 == 0 ? length / 2 : (length+1) / 2;

    Set<Integer> remove = new HashSet<>();
    while (++count < length) {
      int[] scores = new int[length];
      for (int[] order : orders) {
        for (int j = 0; j < length; j++) {
          if (!remove.contains(order[j])) {
            scores[order[j]]++;
            break;
          }
        }
      }

      int min=123456789, max=scores[0];
      int minIdx=-1, maxIdx=0;
      for (int i=0; i<length; i++) {
        if (scores[i] >= max) {
          max = scores[i];
          maxIdx = i;
        }

        if (!remove.contains(i) && scores[i] < min) {
          min = scores[i];
          minIdx = i;
        }
      }

      if (max >= boundary) {
        answer[1] = maxIdx;
        break;
      }
      remove.add(minIdx);
    }

    answer[0] = count;

    return answer;
  }
}
