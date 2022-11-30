package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class4_1932 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[][] dp = new int[n][n];
    StringTokenizer st;
    for (int i=0; i<n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j=0; j<i+1; j++) {
        dp[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for (int i=n-2; i>-1; i--) {
      for (int j=0; j<i+1; j++) {
        dp[i][j] += Math.max(dp[i+1][j], dp[i+1][j+1]);
      }
    }

    System.out.println(dp[0][0]);
  }
}
