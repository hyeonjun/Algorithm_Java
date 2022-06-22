package Class.class2;

import java.util.Arrays;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class class2_10814 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    StringTokenizer st;
    String[][] arr = new String[n][2];
    StringBuilder sb = new StringBuilder();

    for (int i=0; i<n; i++) {
      st = new StringTokenizer(br.readLine());
      arr[i][0] = st.nextToken();
      arr[i][1] = st.nextToken();
    }

    Arrays.sort(arr, Comparator.comparingInt(o -> Integer.parseInt(o[0])));

    for (int i=0; i<n; i++) sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
    System.out.println(sb);
  }
}