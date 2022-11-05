package BOJ.Class.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class class2_18111 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken()), b=Integer.parseInt(st.nextToken());

    int[][] arr = new int[n][m];
    for (int i=0; i<n; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      for (int j=0; j<m; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    int time=Integer.MAX_VALUE, height=0;

    for (int h=0; h<257; h++) {
      int remove=0, add=0;
      for (int i=0; i<n; i++) {
        for (int j=0; j<m; j++) {
          if (arr[i][j] < h) add += h - arr[i][j];
          else remove += arr[i][j] - h;
        }
      }

      if (remove + b < add) continue;
      if ((remove * 2 + add) <= time) {
        time = remove * 2 + add;
        height = h;
      }
    }
    System.out.println(time + " " + height);
  }
}
