package woowacource.precourse;

import java.util.Set;

public class Problem3 {

  /*
  long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기

  //실험할 코드 추가

  long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
  long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
  System.out.println("시간차이(m) : "+secDiffTime);
   */

  static Set<Character> contains = Set.of('3', '6', '9');

  public static void main(String[] args) {
//    System.out.println(solution1(13)); // 4
//    System.out.println(solution1(33)); // 14
    long start1 = System.currentTimeMillis();
    System.out.println(solution1(10000));
    long end1 = System.currentTimeMillis();
    System.out.println("1번 솔루션 시간: " + (end1 - start1));

//    System.out.println(solution2(13)); // 4
//    System.out.println(solution2(33)); // 14
    long start2 = System.currentTimeMillis();
    System.out.println(solution2(10000));
    long end2 = System.currentTimeMillis();
    System.out.println("2번 솔루션 시간: " + (end2 - start2));
  }

  public static int solution1(int number) {
    int answer = 0;

    for (int n=3; n<number+1; n++) {
      String str = Integer.toString(n);

      for (int i=0; i<str.length(); i++) {
        if (contains.contains(str.charAt(i))) {
          answer++;
        }
      }
    }
    return answer;
  }

  public static int solution2(int number) {
    int answer = 0;
    for(int i = 2; i <= number; i++) {
      String str = Integer.toString(i);
      for(int j = 0; j < str.length(); j++){
        if (str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9') {
          answer++;
        }
      }
    }
    return answer;
  }
}
