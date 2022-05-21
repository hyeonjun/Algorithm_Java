package Class.class1;

import java.util.Scanner;

public class Class1_11654 {

    public static void main(String[] args) throws Exception {
        // 아스키 코드 출력
        // System.in: byte 값으로 문자 한 개만 읽으면서 해당 문자에 대응되는 아스키코드 값을 저장
        int answer1 = System.in.read();
        System.out.println(answer1);

        Scanner sc = new Scanner(System.in);
        int answer2 = sc.next().charAt(0);
        System.out.println(answer2);
    }
}
