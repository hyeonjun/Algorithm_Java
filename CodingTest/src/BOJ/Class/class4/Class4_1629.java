package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class4_1629 {

  // b == 1 -> a % c

  // 지수가 짝수
  // a^8 = a^4 * a^4
  //     = (a^2 * a^2) * (a^2 * a^2)
  //     = ((a * a) * (a * a)) * ((a * a) * (a * a))

  // 지수가 홀수
  // a^9 = a^4 * a^4 * a
  //     = (a^2 * a^2) * (a^2 * a^2) * a
  //     = ((a * a) * (a * a)) * ((a * a) * (a * a)) * a

  static long a, b, c;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    a = Long.parseLong(st.nextToken());
    b = Long.parseLong(st.nextToken());
    c = Long.parseLong(st.nextToken());
    System.out.println(divide(a, b, c));
  }

  private static long divide(long x, long y, long z) {
    if (y == 1) {
      return x % z;
    }
    long tmp = divide(x, y/2, z);
    if (y % 2 == 0) {
      return tmp * tmp % z;
    } else {
      return (tmp * tmp % z) * x % z;
    }
  }
}
