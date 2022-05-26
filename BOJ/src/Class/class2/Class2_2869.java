package Class.class2;

import java.io.*;
import java.util.*;

public class Class2_2869 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        System.out.println((int) Math.ceil((double) (v-b)/(a-b)));
    }
}
