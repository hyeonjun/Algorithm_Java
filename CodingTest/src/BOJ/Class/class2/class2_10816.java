package BOJ.Class.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class class2_10816 {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Map<Integer, Integer> map = new HashMap<>();
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i=0; i<n; i++) {
      int x = Integer.parseInt(st.nextToken());
      if (map.containsKey(x)) map.put(x, map.get(x)+1);
      else map.put(x, 1);
    }
    int m = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine(), " ");
    StringBuilder sb = new StringBuilder();
    for (int i=0; i<m; i++) sb.append(map.getOrDefault(Integer.parseInt(st.nextToken()), 0)).append(" ");
    System.out.println(sb);
  }
}
