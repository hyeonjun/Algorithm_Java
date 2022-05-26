package Class.class2;

import java.io.*;
import java.util.*;

public class Class2_2798 {

    static List<int[]> result = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
        permutation(arr, new int[3], new boolean[n], 3, 0, 0);
        int answer = 0;
        for (int[] r: result) {
            int sum = Arrays.stream(r).sum();
            if (sum <= m) answer = Math.max(answer, sum);
        }
        System.out.println(answer);
    }

    static void permutation(int[] input, int[] output, boolean[] visited, int depth, int idx, int start) {
        if (depth == idx) {
            result.add(output.clone());
            return;
        }

        for (int i=start; i<input.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[idx] = input[i];
                permutation(input, output, visited, depth, idx+1, i+1);
                visited[i] = false;
            }
        }

    }
}
