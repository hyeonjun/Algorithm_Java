package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Class3_1676 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int answer = 0;

    while (n >= 5) {
      answer += n / 5;
      n /= 5;
    }
    System.out.println(answer);
  }
}
