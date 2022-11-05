package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Class3_18870 {

  public static void main(String[] args) throws IOException {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    int[] sort = new int[n];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i=0; i<n; i++) {
      int x = Integer.parseInt(st.nextToken());
      arr[i] = sort[i] = x;
    }

    Arrays.sort(sort);
    int rank = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int x : sort) {
      if (!map.containsKey(x)) {
        map.put(x, rank);
        rank++;
      }
    }

    StringBuilder sb = new StringBuilder();
    Arrays.stream(arr)
        .forEach(x -> sb.append(map.get(x)).append(" "));
    System.out.println(sb);
  }
}
