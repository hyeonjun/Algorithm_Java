package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class3_11403 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int n = Integer.parseInt(br.readLine());

    int[][] graph = new int[n][n];
    for (int i=0; i<n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j=0; j<n; j++) {
        graph[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    // 플로이드-와샬
    for (int k=0; k<n; k++) {
      for (int i=0; i<n; i++) {
        for (int j=0; j<n; j++) {
          if (graph[i][j] == 1 || (graph[i][k] == 1 && graph[k][j] == 1)) {
            graph[i][j] = 1;
          }
        }
      }
    }

    for (int i=0; i<n; i++) {
      for (int j=0; j<n; j++) {
        System.out.print(graph[i][j]+" ");
      }
      System.out.println();
    }
  }
}
