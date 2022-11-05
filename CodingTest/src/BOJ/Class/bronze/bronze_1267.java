package BOJ.Class.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bronze_1267 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[] arr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

    int x=0, y=0;
    for (int i=0; i<n; i++) {
      x += (arr[i] / 30 + 1) * 10;
      y += (arr[i] / 60 + 1) * 15;
    }

    StringBuilder sb = new StringBuilder();
    if (x < y) sb.append(String.format("Y %d", x));
    else if (x > y) sb.append(String.format("M %d", y));
    else sb.append(String.format("Y M %d", x));
    System.out.println(sb);
  }
}
