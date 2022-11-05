package BOJ.Class.class1;

import java.io.*;
import java.util.*;

public class Class1_10869 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        System.out.println(add(a, b)); // System.out.println(a + b);
        System.out.println(sub(a, b)); // System.out.println(a - b);
        System.out.println(mul(a, b)); // System.out.println(a * b);
        System.out.println(div(a, b)); // System.out.println(a / b);
        System.out.println(mod(a, b)); // System.out.println(a % b);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    static int mod(int a, int b) {
        return a % b;
    }
}
