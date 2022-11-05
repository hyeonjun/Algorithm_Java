package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class3_11047 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n=Integer.parseInt(st.nextToken()), k=Integer.parseInt(st.nextToken());
    int[] coin = new int[n];
    for (int i=0; i<n; i++) coin[i] = Integer.parseInt(br.readLine());

    int answer = 0;
    for (int i=n-1; i > -1; i--) {
      if (coin[i] <= k) {
        answer += (k / coin[i]);
        k %= coin[i];
      }
    }
    System.out.println(answer);
  }
}
