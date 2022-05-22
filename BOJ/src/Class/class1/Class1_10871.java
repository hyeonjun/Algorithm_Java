package Class.class1;

import java.io.*;
import java.util.*;

public class Class1_10871 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int num;
        for (int i=0; i<n; i++) {
            num = Integer.parseInt(st.nextToken());
            if (num < x) sb.append(num).append(" ");
        }
        System.out.println(sb);
    }
}
