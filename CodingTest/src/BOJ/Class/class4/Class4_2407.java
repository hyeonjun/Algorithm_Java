package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Class4_2407 {
  // nCm => n! / (n-m)! * m!

  static int n, m;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    System.out.println(dp());
    System.out.println(factorial());
  }

  private static BigDecimal dp() {
    BigDecimal[][] dp = new BigDecimal[1001][1001];

    for (int i=1; i<=n; i++) {
      for (int j=0; j<=i; j++) {
        if (j == 0 || j == i) {
          dp[i][j] = new BigDecimal("1");
        } else {
          dp[i][j] = dp[i-1][j-1].add(dp[i-1][j]);
        }
      }
    }

    return dp[n][m];
  }

  private static BigInteger factorial() {
    BigInteger num1 = BigInteger.ONE;
    BigInteger num2 = BigInteger.ONE;
    for (int i=0; i<m; i++) {
      num1 = num1.multiply(new BigInteger(String.valueOf(n-i)));
      num2 = num2.multiply(new BigInteger(String.valueOf(i+1)));
    }

    return num1.divide(num2);
  }

}
