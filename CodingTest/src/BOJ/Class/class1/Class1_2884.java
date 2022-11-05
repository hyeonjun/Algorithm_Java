package BOJ.Class.class1;

import java.io.*;
import java.util.*;

public class Class1_2884 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int h = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        if (m < 45) {
            m += 15;
            if (h -1 < 0) h = 23;
            else h --;
        } else m -= 45;
        System.out.println(h + " " + m);
    }
}
