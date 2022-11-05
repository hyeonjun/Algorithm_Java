package BOJ.Class.class2;

import java.io.*;
import java.util.*;

public class Class2_11050 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        System.out.println(factorial_test(n, k));
        System.out.println(dp_test(n, k));
    }

    // 팩토리얼: 이항계수 정의 이용
    static long factorial_test(int n, int k) {
        return factorial(n) / factorial(k) / factorial(n-k);
    }

    static long factorial(int n) {
        long res = 1;
        for (int i=2; i<n+1; i++) res *= i;
        return res;
    }

    // 동적 계획법: 이항계수 성질 이용용
   static long dp_test(int n, int k) {
       long[][] dp = new long[n+1][k+1];
        for (int i=0; i<n+1; i++) dp[i][0] = 1;
        for (int i=0; i<k+1; i++) dp[i][i] = 1;
        for (int i=1; i<n+1; i++) {
            for (int j=1; j<k+1; j++) {
                dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
            }
        }
        return dp[n][k];
    }
}
