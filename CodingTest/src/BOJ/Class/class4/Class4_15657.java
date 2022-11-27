package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Class4_15657 {

  static int n, m;
  static int[] num;
  static List<String> arr = new ArrayList<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    num = new int[n];
    st = new StringTokenizer(br.readLine());
    for (int i=0; i<n; i++) {
      num[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(num);

    dfs(0);
  }

  private static void dfs(int start) {
    if (arr.size() == m) {
      System.out.println(String.join(" ", arr));
      return;
    }

    for (int i=start; i<n; i++) {
      String x = String.valueOf(num[i]);
      arr.add(x);
      dfs(i);
      arr.remove(arr.size()-1);
    }
  }
}
