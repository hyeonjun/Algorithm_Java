package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class3_1107 {

  static boolean[] button;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int m = Integer.parseInt(br.readLine());

    button = new boolean[10];

    StringTokenizer st;
    if (m > 0) {
      st = new StringTokenizer(br.readLine(), " ");
      while (st.hasMoreTokens()) {
        int x = Integer.parseInt(st.nextToken());
        button[x] = true;
      }
    }

    int answer = Math.abs(100 - n); // 현재 채널 - 목표 채널
    for (int i=0; i<1000000; i++) {
      if (!check(String.valueOf(i).split(""))) {
        continue;
      }
      answer = Math.min(answer, Math.abs(n - i)+String.valueOf(i).length());
    }
    System.out.println(answer);
  }

  private static boolean check(String[] ch) {
    for (String s : ch) {
      if (button[(Integer.parseInt(s))]) {
        return false;
      }
    }
    return true;
  }

}
