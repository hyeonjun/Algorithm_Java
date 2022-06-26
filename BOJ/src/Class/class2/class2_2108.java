package Class.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class class2_2108 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    double sum = 0;
    int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
    Map<Integer, Integer> map = new HashMap<>();
    int[] arr = new int[n];
    for (int i=0; i<n; i++) {
      int x = Integer.parseInt(br.readLine());
      arr[i] = x;
      sum += x;
      max = Math.max(max, x);
      min = Math.min(min, x);
      if (map.containsKey(x)) map.put(x, map.get(x)+1);
      else map.put(x, 1);
    }

    Arrays.sort(arr);

    ArrayList<Integer> modArr = new ArrayList<>();
    int maxCount = Collections.max(map.values());
    for (Entry<Integer, Integer> ent : map.entrySet()) {
      if (ent.getValue() == maxCount) modArr.add(ent.getKey());
    }
    Collections.sort(modArr);
    int mod = modArr.size() > 1 ? modArr.get(1) : modArr.get(0);

    StringBuilder sb = new StringBuilder();
    sb.append(Math.round(sum / n)).append("\n");
    sb.append(arr[(n-1) / 2]).append("\n");
    sb.append(mod).append("\n");
    sb.append(max - min).append("\n");
    System.out.println(sb);
  }
}