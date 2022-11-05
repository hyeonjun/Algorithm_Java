package BOJ.Class.class1;

import java.io.*;
import java.util.*;

public class Class1_1008 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Double a = Double.parseDouble(st.nextToken()), b = Double.parseDouble(st.nextToken());
        System.out.println(a / b);
    }
}
