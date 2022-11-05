package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Class3_1697 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    Queue<Integer> queue = new LinkedList<>();
    queue.add(n);

    int x;
    int[] visited = new int[100001];
    visited[n] = 1;

    while(!queue.isEmpty()) {
      x = queue.remove();
      if (x == k) {
        break;
      }
      List<Integer> newX = Arrays.asList(x+1, x-1, x*2);
      for (int nx : newX) {
        if (0 <= nx && nx < 100001 && visited[nx] == 0) {
          visited[nx] = visited[x] + 1;
          queue.add(nx);
        }
      }
//      if (x-1 >= 0 && visited[x-1] == 0) {
//        visited[x-1] = visited[x] + 1;
//        queue.add(x-1);
//      }
//      if (x+1 <= 100000 && visited[x+1] == 0) {
//        visited[x+1] = visited[x] + 1;
//        queue.add(x+1);
//      }
//      if (2 * x <= 100000 && visited[2*x] == 0) {
//        visited[2 * x] = visited[x] + 1;
//        queue.add(2 * x);
//      }
    }

    System.out.println(visited[k] == 0 ? -1 : visited[k] - 1);

  }

}
