package BOJ.Class.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class class2_1966 {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    StringTokenizer st;
    for (int i=0; i<t; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
      int answer = 0;

      Queue<int[]> queue = new LinkedList<>();
      st = new StringTokenizer(br.readLine(), " ");
      for (int j=0; j<n; j++) queue.add(new int[] {j, Integer.parseInt(st.nextToken())});

      while (true) {
        int[] prev = queue.remove(); // 현재 제일 앞에 있는 것
        boolean flag = true;
        for (int[] nxt : queue) {
          if (nxt[1] > prev[1]) { // 우선 순위 높은게 있으면
            flag = false;
            break;
          }
        }
        if (flag) {
          answer++;
          if (prev[0] == m) break; // 알아낼 위치
        } else queue.add(prev);
      }
      System.out.println(answer);
    }
  }
}
