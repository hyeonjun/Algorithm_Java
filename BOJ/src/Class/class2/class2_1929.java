package Class.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class class2_1929 { // 에라토스테네스 체

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());

    boolean[] arr = new boolean[m+1];
    for (int i=2; i<m+1; i++) {
      if (!arr[i]) {
        for (int j=i*2; j<m+1; j+=i) {
          arr[j] = true;
        }
      }
    }
    for (int i=n; i<m+1; i++) {
      if (i < 2) continue;
      if (!arr[i]) {
        System.out.println(i);
      }
    }
  }
}
