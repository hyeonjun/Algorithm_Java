package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Class4_1043 {

  static int[] parent;
  static int n, m;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    parent = new int[n+1];
    for (int i=0; i<n+1; i++) {
      parent[i] = i;
    }

    st = new StringTokenizer(br.readLine());
    int t = Integer.parseInt(st.nextToken());
    int knownTruePersonParent = -1;
    if (t != 0) {
      knownTruePersonParent = Integer.parseInt(st.nextToken());
      while (st.hasMoreTokens()) {
        union(knownTruePersonParent, Integer.parseInt(st.nextToken()));
      }
    }

    List<int[]> party = new ArrayList<>();
    for (int i=0; i<m; i++) {
      st = new StringTokenizer(br.readLine());
      int[] tmp = new int[Integer.parseInt(st.nextToken())];
      for (int j=0; j<tmp.length; j++) {
        tmp[j] = Integer.parseInt(st.nextToken());
      }
      party.add(tmp);

      for (int j=0; j<tmp.length-1; j++) {
        union(tmp[j], tmp[j+1]);
      }
    }

    int result = 0;
    for (int[] p: party) {
      for (int j : p) {
        if (t > 0 && find(j) == find(knownTruePersonParent)) {
          result++;
          break;
        }
      }
    }

    System.out.println(m - result);
  }

  private static int find(int x) {
    if (parent[x] == x) {
      return x;
    }
    parent[x] = find(parent[x]);
    return parent[x];
  }

  private static void union(int a, int b) {
    a = find(a);
    b = find(b);
    if (a != b) {
      parent[b] = a;
    }
  }
}
