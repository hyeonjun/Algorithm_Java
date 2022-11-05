package BOJ.Class.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bronze_2566 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] numbers;

    int max=-1;
    int x=0, y=0;

    for (int i=1; i<10; i++) {
      numbers = br.readLine().split(" ");
      for (int j=1; j<10; j++) {
        int n = Integer.parseInt(numbers[j-1]);
        if (max < n) {
          max = n;
          x = i;
          y = j;
        }
      }
    }
    System.out.printf("%d\n%d %d%n", max, x, y);
  }
}
