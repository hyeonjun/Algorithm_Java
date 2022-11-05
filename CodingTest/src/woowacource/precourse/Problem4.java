package woowacource.precourse;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {

  static Map<Character, Character> map = new HashMap<>();

  public static void main(String[] args) {
    System.out.println(solution1("I love you")); // R olev blf
    System.out.println(solution2("I love you")); // R olev blf
  }

  public static String solution1(String word) {
    String answer = "";

    char u=65, l=97;
    for (int i=0; i<26; i++) {
      map.put(u, (char) (90 - u++ + 65));
      map.put(l, (char) (122 - l++ + 97));
    }

    for (int i=0; i<word.length(); i++) {
      if (word.charAt(i) == ' ') {
        answer += " ";
        continue;
      }

      answer += String.valueOf(map.get(word.charAt(i)));
    }
    return answer;
  }

  public static String solution2(String word) {
    String answer = "";

    for (int i=0; i<word.length(); i++) {
      char c = word.charAt(i);
      if (Character.isUpperCase(c)) {
        c = (char) (90 - c + 65);
      } else if (Character.isLowerCase(c)) {
        c = (char) (122 - c + 97);
      }
      answer += String.valueOf(c);
    }
    return answer;
  }

}
