package Class.class2;

import java.io.*;
import java.util.*;

public class Class2_1085 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x=Integer.parseInt(st.nextToken()), y=Integer.parseInt(st.nextToken());
        int w=Integer.parseInt(st.nextToken()), h=Integer.parseInt(st.nextToken());
        System.out.println(Math.min(Math.min(x, y), Math.min(w-x, h-y)));
    }
}
