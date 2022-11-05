package BOJ.Class.class1;

import java.io.*;
import java.util.*;

public class Class1_2577 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 1;
        for (int i=0; i<3; i++)
            result *= Integer.parseInt(br.readLine());
        int[] answer = new int[10];
        String str = String.valueOf(result);
        for (int i=0; i<str.length(); i++) {
            answer[Integer.parseInt(String.valueOf(str.charAt(i)))] += 1;
        }
        Arrays.stream(answer).forEach(System.out::println);
    }
}
