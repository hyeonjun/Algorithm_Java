package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class4_11660 {

  /*
  => (x1, y1) ~ (x2, y2)의 합 =
  prefix_sum[x2][y2] - prefix_sum[x1-1][y2] - prefix_sum[x2][y1-1] + prefix_sum[x1-1][y1-1]
   */
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

    int[][] arr = new int[n][n];
    for (int i=0; i<n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j=0; j<n; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    int[][] prefixSum = new int[n+1][n+1];
    for (int i=0; i<n; i++) {
      for (int j=0; j<n; j++) {
        prefixSum[i+1][j+1] = prefixSum[i][j+1] + prefixSum[i+1][j] - prefixSum[i][j] + arr[i][j];
      }
    }

    for (int i=0; i<m; i++) {
      st = new StringTokenizer(br.readLine());
      int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken()), y2 = Integer.parseInt(st.nextToken());
      System.out.println(prefixSum[x2][y2] - prefixSum[x1-1][y2] - prefixSum[x2][y1-1] + prefixSum[x1-1][y1-1]);
    }
  }
}
