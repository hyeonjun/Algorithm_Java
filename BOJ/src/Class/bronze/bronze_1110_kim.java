package Class.bronze;

import java.util.Scanner;

public class bronze_1110_kim {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();

    int A = Integer.parseInt(a);
    int count = 0;
    for (; ; ) {
      if (a.length() == 1) {
        a = a + "0";
      }
      int b = ((a.charAt(0) - '0') + (a.charAt(1) - '0')) % 10;
      int sum = (a.charAt(1) - '0') * 10 + b;
      count++;
      if (sum == A) {
        System.out.println(count);
        break;
      }
      a = String.valueOf(sum);
    }
  }
}
