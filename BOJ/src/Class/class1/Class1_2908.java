package Class.class1;

import java.io.*;
import java.util.*;

public class Class1_2908 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb1 = new StringBuilder(st.nextToken());
        StringBuilder sb2 = new StringBuilder(st.nextToken());
        int a=Integer.parseInt(sb1.reverse().toString());
        int b=Integer.parseInt(sb2.reverse().toString());
        System.out.println(Math.max(a, b));
    }
}
