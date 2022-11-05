package jabis;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class solution1 {

  public static void main(String[] args) {
    String[] students = {"AAALLLAPAA", "AAAAAAAPPP", "ALAAAAPAAA"};
    System.out.println(Arrays.toString(solution(students)));
  }

  public static int[] solution(String[] students) {
    int length = students.length;

    int[] answer = new int[length];
    int[][] scores = new int[length][2]; // 학생들 번호, 점수
    int idx = 1;
    for (String student : students) {
      int score = 0;
      Map<String, Integer> result = new HashMap<>();
      for (String attend : student.split("")) {
        if (result.containsKey(attend)) {
          int x = result.get(attend)+1;
          result.put(attend, x);
        } else {
          result.put(attend, 1);
        }
      }

      // 지각 2회는 결석 1번으로 처리
      if (result.containsKey("L")) {
        result.put("P", result.getOrDefault("P", 0) + result.get("L") / 2);
      }

      // 결석 횟수가 3회보다 적을 경우에만 점수 추가
      if (result.getOrDefault("P", 0) < 3) {
        score += result.getOrDefault("A", 0);
        score -= result.getOrDefault("P", 0);
      }

      scores[idx-1][0] = idx;
      scores[idx-1][1] = score;
      idx++;
    }

    Arrays.sort(scores, (o1, o2) -> {
      if (o1[1] == o2[1]) {
        return o1[0] - o2[0];
      }
      return o2[1] - o1[1];
    });

    for (int i=0; i< length; i++) {
      answer[i] = scores[i][0];
    }

    return answer;
  }
}
