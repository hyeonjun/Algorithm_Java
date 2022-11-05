package BOJ.Class.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class class2_2805 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine(), " ");
    int[] arr = new int[n];
    int left=1, right=0;
    for (int i=0;i<n;i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      right = Math.max(right, arr[i]);
    }

    System.out.println(binary_search_1(arr, m, left, right));
    System.out.println(binary_search_2(arr, m, left, right));
  }

  static int binary_search_1(int[] arr, int m, int min, int max) {
    int left=min, right=max;
    while (left <= right) {
      int mid = (left + right) / 2;
      long height = 0;
      for (int h: arr)
        if (h > mid) height += h - mid;

      if (height >= m) left = mid+1;
      else right = mid-1;
    }
    return right;
  }

  static int binary_search_2(int[] arr, int m, int min, int max) {
    int left=min, right=max;
    while (left < right) {
      int mid = (left + right) / 2;
      long height = 0;
      for (int h: arr)
        if (h > mid) height += h - mid;

      if (height < m) right = mid;
      else left = mid+1;
    }
    return left-1;
  }
}
