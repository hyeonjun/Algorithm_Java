package BOJ.Class.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bronze_1110 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int n_ = n;
    int cnt = 0;

    while (true) {
      int n1 = (n % 10) * 10; // n의 가장 오른쪽 자리 * 10 -> 십의 자리
      int n2 = ((n / 10) + (n % 10)) % 10; // 각 자리 수 합에서 가장 오른쪽 자리 수 -> 일의 자리
      int n3 = n1 + n2;

      cnt++;

      if (n3 == n_) {
        break;
      }
      n = n3;
    }
    System.out.println(cnt);
  }

}
