package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Class3_1931 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st;

    int[][] arr = new int[n][2];
    for (int i=0; i<n; i++) {
      st = new StringTokenizer(br.readLine());
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr, (i1, i2) -> {
      if (i1[1] == i2[1]) {
        return i1[0] - i2[0];
      }
      return i1[1] - i2[1];
    });

    int count = 0;
    int currentLastTime = 0;
    for (int i=0; i<n; i++) {
      int x = arr[i][0];
      int y = arr[i][1];

      if (x >= currentLastTime) {
        count++;
        currentLastTime = y;
      }
    }

    System.out.println(count);


  }
}
