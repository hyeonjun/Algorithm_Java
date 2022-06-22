package Class.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class class2_1920 {

  static int[] arr;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    arr = new int[n];
    for (int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
    arr = Arrays.stream(arr).sorted().toArray();

    int m = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine(), " ");
    int[] target = new int[m];
    for (int i=0; i<m; i++) target[i] = Integer.parseInt(st.nextToken());

    for (int i : target) {
      System.out.println(binarySearch(i));
    }
  }

  static int binarySearch(int target) {
    int start=0, end=arr.length-1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (arr[mid] == target) return 1;
      if (arr[mid] <= target) start = mid+1;
      else end = mid-1;
    }
    return 0;
  }
}
