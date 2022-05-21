package Class.class1;

import java.io.*;
import java.util.*;

public class Class1_2475 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int answer = 0;
        while (st.hasMoreTokens()) {
            answer += Math.pow(Integer.parseInt(st.nextToken()), 2);
        }
        System.out.println(answer % 10);
    }
}
