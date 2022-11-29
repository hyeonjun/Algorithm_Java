package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Class4_1149 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    StringTokenizer st;
    int[][] rgb = new int[n][3];
    for (int i=0; i<n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j=0; j<3; j++) {
        rgb[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for (int i=1; i<n; i++) {
      // 0번 칠할 때, 이전 집 1번 색칠 vs 2번 색칠
      rgb[i][0] += Math.min(rgb[i-1][1], rgb[i-1][2]);
      // 1번 칠할 때, 이전 집 0번 색칠 vs 2번 색칠
      rgb[i][1] += Math.min(rgb[i-1][0], rgb[i-1][2]);
      // 2번 칠할 때, 이전 집 0번 색칠 vs 1번 색칠
      rgb[i][2] += Math.min(rgb[i-1][0], rgb[i-1][1]);
    }

    System.out.println(Arrays.stream(rgb[n-1]).min().getAsInt());
  }
}
