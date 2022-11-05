package BOJ.Class.class2;

import java.io.*;
import java.util.*;

public class Class2_1654 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long[] arr = new long[n];
        long start=1, end=-1;
        for (int i=0; i<n; i++) {
            long a = Integer.parseInt(br.readLine());
            arr[i] = a;
            end = Math.max(end, a);
        }
        while (start <= end) {
            long mid = (start + end) / 2;
            long line = 0;
            for (long a : arr) line += a / mid;
            if (k <= line) start = mid + 1;
            else end = mid - 1;
        }
        System.out.println(end);
    }
}
