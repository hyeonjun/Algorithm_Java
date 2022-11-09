package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Class3_5525 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int m = Integer.parseInt(br.readLine());
    String[] S = br.readLine().split("");

    int count = 0;
    int idx = 1;
    int position = 0;
    while (idx < m-1) {
      if (S[idx-1].equals("I") && S[idx].equals("O") && S[idx+1].equals("I")) {
        position++;
        if (position == n) {
          position--;
          count++;
        }
        idx++;
      } else {
        position = 0;
      }
      idx++;
    }
    System.out.println(count);
  }
}
