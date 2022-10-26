package Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class3_1389 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
    int[][] graph = new int[n+1][n+1];

    for (int i=0; i<n+1; i++) {
      for (int j=0; j<n+1; j++) {
        graph[i][j] = 987654321;
      }
    }
    for (int i=0; i<m; i++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      graph[x][y] = graph[y][x] = 1;
    }

    for (int k=0; k<n+1; k++) {
      for (int i=0; i<n+1; i++) {
        for (int j=0; j<n+1; j++) {
          if (i == j) {
            graph[i][j] = 0;
          } else {
            graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
          }
        }
      }
    }

    int res=987654321, idx=-1;
    for (int i=1; i<n+1; i++) {
      int sum = 0;
      for (int j=1; j<n+1; j++) {
        sum += graph[i][j];
      }

      if (res > sum) {
        res = sum;
        idx = i;
      }
    }

    System.out.println(idx);

  }
}
