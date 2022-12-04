package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Class4_2096 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    StringTokenizer st;
    int[] maxDp = new int[6]; //  0    1    2    3   4    5
    int[] minDp = new int[6]; // [현재, 현재, 현재, 과거, 과거, 과거]

    for (int i=0; i<n; i++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      int z = Integer.parseInt(st.nextToken());

      maxDp[0] = Math.max(maxDp[3], maxDp[4]) + x;
      maxDp[1] = Math.max(Math.max(maxDp[3], maxDp[4]), maxDp[5]) + y;
      maxDp[2] = Math.max(maxDp[4], maxDp[5]) + z;

      minDp[0] = Math.min(minDp[3], minDp[4]) + x;
      minDp[1] = Math.min(Math.min(minDp[3], minDp[4]), minDp[5]) + y;
      minDp[2] = Math.min(minDp[4], minDp[5]) + z;

      for (int j=0; j<3; j++) {
        maxDp[j+3] = maxDp[j];
        minDp[j+3] = minDp[j];
      }
    }
    int max = Arrays.stream(Arrays.copyOfRange(maxDp, 0, 3)).max().getAsInt();
    int min = Arrays.stream(Arrays.copyOfRange(minDp, 0, 3)).min().getAsInt();
    System.out.println(max+" "+min);
  }
}
