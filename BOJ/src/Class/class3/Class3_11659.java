package Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class3_11659 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
    int[] arr = new int[n];
    st = new StringTokenizer(br.readLine(), " ");
    for (int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
    int[] prefix = new int[n+1];
    for (int i=1; i<n+1; i++) {
      prefix[i] = prefix[i-1] + arr[i-1];
    }
    StringBuilder sb = new StringBuilder();
    while (m-- > 0) {
      st = new StringTokenizer(br.readLine(), " ");
      int i=Integer.parseInt(st.nextToken()), j=Integer.parseInt(st.nextToken());
      sb.append(prefix[j] - prefix[i-1]).append("\n");
    }
    System.out.println(sb);
  }
}
