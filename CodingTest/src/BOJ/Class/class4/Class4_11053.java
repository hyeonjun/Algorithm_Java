package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Class4_11053 {

  /*
    10 20 10 30 20 50
    1  2  2  3  3  4
   */

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[] num = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i=0; i<n; i++) {
      num[i] = Integer.parseInt(st.nextToken());
    }

    int[] dp = new int[n];
    Arrays.fill(dp, 1);

    for (int i=1; i<n; i++) {
      for (int j=0; j<i; j++) {
        if (num[j] < num[i]) {
          dp[i] = Math.max(dp[i], dp[j] + 1);
        }
      }
    }
    System.out.println(Arrays.stream(dp).max().getAsInt());
  }
}
