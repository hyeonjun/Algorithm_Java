package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class4_9465 {

  /*
  0  1  2   3  4
  50 10 100 20 40
  30 50 70  10 60

  0  1   2      3                 4                 5
  0  50  10+30  max(100, 30)+100  max(120, 100)+20  max(210, 120)+40 => 250
  0  30  50+50  max(40, 50)+70    max(200, 40)+10   max(140, 200)+60 => 260

  DP[i][j] =
    if i == 0, max(DP[i+1][j-1], DP[i+1][j-2])
    if i == 1, max(DP[i-1][j-1], DP[i-1][j-2])
   */

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    StringTokenizer st;
    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());

      int[][] arr = new int[2][n+1];
      for (int i=0; i<2; i++) {
        st = new StringTokenizer(br.readLine());
        for (int j=1; j<n+1; j++) {
          arr[i][j] = Integer.parseInt(st.nextToken());
        }
      }

      for (int i=2; i<n+1; i++) {
        arr[0][i] += Math.max(arr[1][i-1], arr[1][i-2]);
        arr[1][i] += Math.max(arr[0][i-1], arr[0][i-2]);
      }
      System.out.println(Math.max(arr[0][n], arr[1][n]));
    }
  }
}
