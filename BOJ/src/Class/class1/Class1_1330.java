package Class.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class1_1330 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a=Integer.parseInt(st.nextToken()), b=Integer.parseInt(st.nextToken());
        System.out.println(a > b ? ">" : a == b ? "==" : "<");
    }
}
