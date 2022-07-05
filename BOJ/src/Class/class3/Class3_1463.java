package Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Class3_1463 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] dp = new int[n+1];

    for (int i=2; i<n+1; i++) {
      dp[i] = dp[i-1] + 1; // i-1
      if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i/3]+1); // i / 3
      if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i/2]+1); // i / 2
    }
    System.out.println(dp[n]);
  }
}
