package BOJ.Class.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bronze_2547 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int t = Integer.parseInt(br.readLine());
    while(t-- > 0) {
      br.readLine();

      long reminder = 0L;
      int n = Integer.parseInt(br.readLine());

      for (int i=0; i<n; i++)
        reminder = (reminder + (Long.parseLong(br.readLine()) % n)) % n;

      if (reminder == 0) sb.append("YES\n");
      else sb.append("NO\n");
    }
    System.out.println(sb);
  }
}
