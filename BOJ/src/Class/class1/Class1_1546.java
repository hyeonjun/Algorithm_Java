package Class.class1;

import java.io.*;
import java.util.*;

public class Class1_1546 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[n];
        int max = -1;
        for (int i=0; i<n; i++) {
            int s = Integer.parseInt(st.nextToken());
            arr[i] = s;
            if (max < s) max = s;
        }
        double[] answer = new double[n];
        for (int i=0; i<n; i++) {
            double nn = calc(arr[i], max);
            answer[i] = calc(arr[i], max);
        }
        System.out.println(Arrays.stream(answer).sum() / n);
    }

    static double calc(int score, int max) {
        return (double) score /  max * 100.0;
    }
}
