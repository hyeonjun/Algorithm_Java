package Class.bronze;

import java.util.*;

public class bronze_1152 {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine().trim();
    if (str.isEmpty()) System.out.println(0);
    else System.out.println(str.split(" ").length);
  }
}

