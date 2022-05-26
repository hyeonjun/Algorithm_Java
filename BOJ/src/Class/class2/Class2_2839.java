package Class.class2;

import java.io.*;

public class Class2_2839 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(greedy(n));
        System.out.println(dp(n));
    }

    static int greedy(int n) {
        int answer = 0;
        while (true) {
            if (n % 5 == 0) {
                answer += n / 5;
                return answer;
            }
            n -= 3;
            answer += 1;
            if (n < 0) return -1;
        }
    }

    static long dp(int n) {
        long[] dp = new long[n+1];
        for (int i=1; i<n+1; i++) dp[i] = Integer.MAX_VALUE;
        dp[3]=1;
        if (n > 4) dp[5]=1;
        for (int i=6; i<n+1; i++)
            if (dp[i-3] != Integer.MAX_VALUE || dp[i-5] != Integer.MAX_VALUE)
                dp[i] = Math.min(dp[i-3], dp[i-5]) + 1;
        if (dp[n] == Integer.MAX_VALUE) return -1;
        else return dp[n];
    }
}
