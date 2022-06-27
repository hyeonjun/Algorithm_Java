package Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Class3_1620 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());

    Map<Integer, String> num_name = new HashMap<>();
    Map<String, Integer> name_num = new HashMap<>();

    for (int i=1; i<n+1; i++) {
      String name = br.readLine();
      num_name.put(i, name);
      name_num.put(name, i);
    }

    StringBuilder sb = new StringBuilder();
    for (int i=0; i<m; i++) {
      String key = br.readLine();
      if (isNumeric(key)) {
        sb.append(num_name.get(Integer.parseInt(key)));
      } else {
        sb.append(name_num.get(key));
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }

  static boolean isNumeric (String target) {
    try {
      Double.parseDouble(target);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}
