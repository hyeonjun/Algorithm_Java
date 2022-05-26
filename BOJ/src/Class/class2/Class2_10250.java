package Class.class2;

import java.io.*;
import java.util.*;

public class Class2_10250 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            if (n % h == 0) System.out.println(h * 100 + (n / h));
            else System.out.println((n % h) * 100 + (n / h + 1));
        }
    }
}
