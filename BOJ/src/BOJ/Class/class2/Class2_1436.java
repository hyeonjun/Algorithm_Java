package BOJ.Class.class2;

import java.util.Scanner;

public class Class2_1436 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        long answer = 666;
        while (cnt < n) {
            answer++;
            if (String.valueOf(answer).contains("666")) cnt++;
        }
        System.out.println(answer);
    }
}
