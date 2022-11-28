package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Class4_15663 {

  static int n, m;
  static int[] num;
  static List<String> arr = new ArrayList<>();
  static boolean[] visited;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    num = new int[n];
    visited = new boolean[n];
    st = new StringTokenizer(br.readLine());
    for (int i=0; i<n; i++) {
      num[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(num);

    dfs();
  }

  private static void dfs() {
    if (arr.size() == m) {
      System.out.println(String.join(" ", arr));
      return;
    }

    int current = 0;
    for (int i=0; i<n; i++) {
      if (!visited[i] && num[i] != current) {
        current = num[i];
        String x = String.valueOf(num[i]);
        arr.add(x);
        visited[i] = true;
        dfs();
        visited[i] = false;
        arr.remove(arr.size()-1);
      }
    }
  }
}
