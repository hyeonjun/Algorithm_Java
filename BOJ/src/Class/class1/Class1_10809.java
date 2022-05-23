package Class.class1;

import java.io.*;

public class Class1_10809 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for (char a = 'a'; a < 'z'+1; a++) {
            System.out.print(str.indexOf(a)+" ");
        }
    }
}
