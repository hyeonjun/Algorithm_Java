package Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Class3_17626 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    ArrayList<Integer> dp = new ArrayList<>();
    dp.add(0); dp.add(1);
    for (int i=2; i<n+1; i++) {
      int min = Integer.MAX_VALUE;
      for (int j=1; j*j <= i; j++) {
        min = Math.min(min, dp.get(i-j * j));
      }
      dp.add(min+1);
    }
    System.out.println(dp.get(n));
  }
}
