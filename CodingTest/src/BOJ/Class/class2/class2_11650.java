package BOJ.Class.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class class2_11650 {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][2];

    StringTokenizer st;
    for (int i=0; i<n; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr, (o1, o2) -> { // 11651
      if (o1[0] == o2[0])                    // if (o1[1] == o2[1])
        return o1[1] - o2[1];                //   return o1[0] - o2[0];
      return o1[0] - o2[0];                  // return o1[1] - o2[1]
    });

    StringBuilder sb = new StringBuilder();
    for (int i=0; i<n; i++)
      sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
    System.out.println(sb);
  }
}