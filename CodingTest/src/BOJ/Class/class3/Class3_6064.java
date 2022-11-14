package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class3_6064 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int M = Integer.parseInt(st.nextToken());
      int N = Integer.parseInt(st.nextToken());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      boolean flag = false;
      // M, N의 최소 공배수 => 마지막 해
      while(x <= M * N) {
        if ((x - y) % N == 0) {
          System.out.println(x);
          flag = true;
          break;
        }
        x += M;
      }
      if (!flag) {
        System.out.println(-1);
      }
    }
  }
  /*
  1:1, 2:2, 3:3
  ...
  9:9, 10:10, 1:11, 2:12, 3:1
   */
}
