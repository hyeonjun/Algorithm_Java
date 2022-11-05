package BOJ.Class.class1;

import java.io.*;
import java.util.*;

public class Class1_10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            max = Integer.max(max, num);
            min = Integer.min(min, num);
        }
        System.out.println(min + " " + max);
    }
}
