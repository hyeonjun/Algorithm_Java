package BOJ.Class.class1;

import java.io.*;

public class Class1_2562 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int idx=-1, answer = -1;
        for (int i=0; i<9; i++) {
            int n = Integer.parseInt(br.readLine());
            if (answer < n) {
                answer = n;
                idx = i+1;
            }
        }
        System.out.println(answer+"\n"+idx);
    }
}
