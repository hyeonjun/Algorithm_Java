package BOJ.Class.class2;

import java.io.*;

public class Class2_15829 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long sum=0, pow=1;
        char[] arr = str.toCharArray();
        for (int i=0; i<l; i++) {
            sum += (arr[i] - 'a' + 1) * pow % 1234567891;
            pow = pow * 31 % 1234567891;
        }
        System.out.println(sum % 1234567891);
    }
}
