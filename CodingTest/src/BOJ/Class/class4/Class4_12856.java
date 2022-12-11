package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class4_12856 {

  /*
  배낭 문제 - 모든 무게에 대하여 최대 가지를 저장하기
  DP[i][j] = 배낭에 넣은 물품의 무게 합이 j일 때 최대 가치
  각 물품의 번호 i에 따라서 최대 가치 테이블 DP[i][j]를 갱신
  arr = [[물건 무게, 물건 가치] ... ]
  DP[i][j] =
    if j < arr[i-1][0]:
      DP[i-1][j], 지금 넣을 물건의 무게가 현재 넣을 수 있는 무게보다 크면 이전 물건을 넣을 가치를 넣음
    if j >= arr[i-1][0]:    이전에 넣은 물건의 가치 VS 지금 넣을 물건의 무게를 빼고 남은 무게에 넣을 수 있는 최대 가치 + 지금 넣을 물건의 가치
      max(DP[i-1][j], DP[i-1][j-arr[i-1][0]] + arr[i-1][0])
   */

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
    int[][] arr = new int[n][2];
    for (int i=0; i<n; i++) {
      st = new StringTokenizer(br.readLine());
      int w = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken());
      arr[i] = new int[] {w, v};
    }

    int[][] dp = new int[n+1][k+1];
    for (int i=1; i<n+1; i++) {
      for (int j=1; j<k+1; j++) {
        if (j < arr[i-1][0]) {
          dp[i][j] = dp[i-1][j];
        } else {
          dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-arr[i-1][0]]+arr[i-1][1]);
        }
      }
    }
    System.out.println(dp[n][k]);
  }
}
