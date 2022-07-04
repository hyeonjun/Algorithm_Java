package Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Class3_17219  {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
    Map<String, String> map = new HashMap<>();

    while(n-- > 0) {
      st = new StringTokenizer(br.readLine(), " ");
      String email = st.nextToken();
      String password = st.nextToken();
      map.put(email, password);
    }

    StringBuilder sb = new StringBuilder();
    while (m-- > 0) {
      sb.append(map.get(br.readLine())).append("\n");
    }
    System.out.println(sb);

  }
}
