package BOJ.Class.class2;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Class2_1259 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if (str.equals("0")) break;
            List<Character> arr = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
            if (palindrome(arr)) {
                System.out.println("yes");
            } else System.out.println("no");
        }
    }

    static boolean palindrome(List<Character> arr) {
        List<Character> reverse = new ArrayList<>(arr);
        Collections.reverse(reverse);
        return arr.equals(reverse);
    }
}
