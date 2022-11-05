package BOJ.Class.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Class1_1000 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 배열로 만들어서 stream sum
        int[] arr = new int[st.countTokens()];
        int i=0;
        while (st.hasMoreTokens()) {
            arr[i++] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.stream(arr).sum());

        // 변수 2개에 각각 받아서 sum
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        System.out.println(a + b);
    }
}
