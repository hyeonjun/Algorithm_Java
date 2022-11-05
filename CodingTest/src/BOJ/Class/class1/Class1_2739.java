package BOJ.Class.class1;

import java.util.*;

public class Class1_2739 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<10; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
        sc.close();
    }
}
