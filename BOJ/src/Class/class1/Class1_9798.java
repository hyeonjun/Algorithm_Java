package Class.class1;

import java.util.*;

public class Class1_9798 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String grade;
        switch (score/10) {
            case 9: case 10: grade = "A"; break;
            case 8: grade = "B"; break;
            case 7: grade = "C"; break;
            case 6: grade = "D"; break;
            default: grade = "F";
        }
        System.out.println(grade);
    }
}
