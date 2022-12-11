package BOJ.AlgorithmType.Combination;

public class BackTracking {

  static int n;
  static int[] arr;
  static boolean[] visited;


  public static void main(String[] args) {

    n = 4;
    arr = new int[] {1, 2, 3, 4};
    visited = new boolean[n];

    for (int i=1; i<n+1; i++) {
      System.out.println("\n" + n + "개 중에서 "+i+"개 뽑기");
      comb(0, i);
    }
  }

  private static void comb(int start, int r) {
    if (r == 0) {
      print();
      return;
    }

    for (int i=start; i<n; i++) {
      visited[i] = true;
      comb(i+1, r-1);
      visited[i] = false;
    }
  }

  private static void print() {
    for (int i=0; i<n; i++) {
      if (visited[i]) {
        System.out.print(arr[i]+" ");
      }
    }
    System.out.println();
  }
}
