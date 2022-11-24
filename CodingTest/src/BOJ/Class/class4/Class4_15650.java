package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Class4_15650 {

  static int n,m;
  static List<String> num = new ArrayList<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    dfs(1);
  }

  private static void dfs(int start) {
    if (num.size() == m) {
      System.out.println(String.join(" ", num));
      return;
    }

    for (int i=start; i<n+1; i++) {
      String x = String.valueOf(i);
      if (!num.contains(x)) {
        num.add(x);
        dfs(i+1);
        num.remove(num.size()-1);
      }
    }
  }
}
