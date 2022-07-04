package Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Class3_11399 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int[] arr = new int[n];
    for (int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
    Arrays.sort(arr);
    for (int i=1; i<n; i++) arr[i] += arr[i-1];
    System.out.println(Arrays.stream(arr).sum());
  }
}
