package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class3_1074 {

  static int N, R, C;
  static int answer = 0;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    R = Integer.parseInt(st.nextToken());
    C = Integer.parseInt(st.nextToken());

    int size = (int) Math.pow(2, N);
    divide(size, R, C);
    System.out.println(answer);
  }

  private static void divide(int size, int r, int c) {
    if (size == 1) return;

    if (r < size/2 && c < size/2) { // 2사분면
      divide(size/2, r, c);
    } else if (r < size/2 && c >= size/2) { // 1사분면
      answer += size * size / 4;
      divide(size/2, r, c-size/2);
    } else if (r >= size/2 && c < size/2) { // 3사분면
      answer += size * size / 4 * 2;
      divide(size/2, r-size/2, c);
    } else { // 4사분면
      answer += size * size / 4 * 3;
      divide(size/2, r-size/2, c-size/2);
    }
  }

}
