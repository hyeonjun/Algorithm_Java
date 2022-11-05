package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Class3_9095 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      System.out.println(dpByArray(n));
      System.out.println(dpByRecursive(n));
    }
  }

  static int dpByArray(int n) {
    ArrayList<Integer> dp = new ArrayList<>();
    dp.add(1); dp.add(2); dp.add(4);
    if (n < 4) return dp.get(n-1);
    else {
      for (int i=3; i<n; i++) dp.add(dp.get(i-3) + dp.get(i-2) + dp.get(i-1));
      return dp.get(n-1);
    }
  }

  static int dpByRecursive(int n) {
    if (n == 1) return 1;
    else if (n == 2) return 2;
    else if (n == 3) return 4;
    return dpByRecursive(n-1) + dpByRecursive(n-2) + dpByRecursive(n-3);
  }
}
