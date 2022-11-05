package BOJ.Class.class2;

import java.io.*;

public class Class2_2231 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i=1; i<n+1; i++) {
            String str = Integer.toString(i);
            int result = i;
            for (int s=0; s<str.length(); s++) result += str.charAt(s) - '0';
            if (result == n) {
                System.out.println(i);
                break;
            }
            if (i == n) System.out.println(0);
        }
    }
}
