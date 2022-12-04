package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class4_9251 {

  /*
  A C A Y K P
  C A P C A K
    0 C A P C A K
  0 0 0 0 0 0 0 0
  A 0 0 1 1 1 1 1
  C 0 1 1 1 2 2 2
  A 0 1 2 2 2 3 3
  Y 0 1 2 2 2 3 3
  K 0 1 2 2 2 3 4
  P 0 1 2 3 3 3 4
  DP[i][j] =
    -> if X[i] = Y[i], DP[i-1][j-1] + 1
    -> if X[i] != Y[i], max(DP[i-1][j], DP[i][j-1])
   */

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input1 = br.readLine();
    String input2 = br.readLine();
    int n = input1.length(), m = input2.length();
    int[][] dp = new int[n+1][m+1];
    for (int i=1; i<n+1; i++) {
      for (int j=1; j<m+1; j++) {
        if (input1.charAt(i-1) == input2.charAt(j-1)) {
          dp[i][j] = dp[i-1][j-1] + 1;
        } else {
          dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        }
      }
    }
    System.out.println(dp[n][m]);
  }
}
