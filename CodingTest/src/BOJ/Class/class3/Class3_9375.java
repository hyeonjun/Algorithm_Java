package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class Class3_9375 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      StringTokenizer st;
      HashMap<String, Integer> map = new LinkedHashMap<>();
      for (int i=0; i<n; i++) {
        st = new StringTokenizer(br.readLine(), " ");
        st.nextToken();
        String key = st.nextToken();
        if (map.containsKey(key))
          map.put(key, map.get(key)+1);
        else map.put(key, 1);
      }

      int answer = 1;
      for (int v : map.values())
        answer *= (v+1);
      System.out.println(answer-1);
    }
  }
}
