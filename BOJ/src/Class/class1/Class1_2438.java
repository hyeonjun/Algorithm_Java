package Class.class1;

import java.util.*;

public class Class1_2438 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            for (int j=0; j<i; j++)
                System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}
