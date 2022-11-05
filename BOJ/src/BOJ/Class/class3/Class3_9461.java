package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Class3_9461 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      ArrayList<Long> seq = new ArrayList<>(Arrays.asList(1L, 1L, 1L));
      for (int i=4; i<n+1; i++) seq.add(seq.get(i-4) + seq.get(i-3));
      System.out.println(seq.get(n-1));
    }
  }
}
