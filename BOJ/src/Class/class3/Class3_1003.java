package Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Class3_1003 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[41][2];
      arr[0][0] = 1;
      arr[1][1] = 1;
      for (int i=2; i<n+1; i++) {
        arr[i][0] = arr[i-1][0] + arr[i-2][0];
        arr[i][1] = arr[i-1][1] + arr[i-2][1];
      }
      System.out.println(arr[n][0] + " " + arr[n][1]);
    }
  }
}
