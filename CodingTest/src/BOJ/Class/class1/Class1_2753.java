package BOJ.Class.class1;

import java.util.Scanner;

public class Class1_2753 {

    public static void main(String[] args) {
        // 윤년 체크
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String answer = "0";
        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
            answer = "1";
        }
        System.out.println(answer);
        sc.close();
    }
}
