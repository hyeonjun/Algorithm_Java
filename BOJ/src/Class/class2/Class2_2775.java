package Class.class2;

import java.io.*;

public class Class2_2775 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t=0; t<T; t++) {
            int k = Integer.parseInt(br.readLine()); // 층
            int n = Integer.parseInt(br.readLine()); // 호
            int[] arr = new int[n+1];
            for (int i=1; i<n+1; i++) arr[i] = i; // 0층 사람 수들로 초기화
            for (int i=0; i<k; i++) {
                for (int j=1; j<n+1; j++) { // 1호부터 n호까지
                    arr[j] += arr[j-1];
                }
            }
            System.out.println(arr[n]);
        }
    }
}
