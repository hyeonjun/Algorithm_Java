package Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Class3_2579 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] stairs = new int[301];
    for (int i=0; i<n; i++) stairs[i] = Integer.parseInt(br.readLine());

    int[] dp = new int[301];
    dp[0] = stairs[0];
    dp[1] = stairs[0] + stairs[1];
    dp[2] = Math.max(stairs[0], stairs[1]) + stairs[2];

    for (int i=3; i<n; i++) dp[i] = Math.max(dp[i-3] + stairs[i-1] + stairs[i], dp[i-2] + stairs[i]);
    System.out.println(dp[n-1]);
  }
}
