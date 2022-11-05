package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Class3_7662 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());

    while (T-- > 0) {
      int k = Integer.parseInt(br.readLine());
      TreeMap<Integer, Integer> queue = new TreeMap<>();

      for (int i=0; i<k; i++) {
        String[] input = br.readLine().split(" ");
        char ch = input[0].charAt(0);
        int n = Integer.parseInt(input[1]);

        if (ch == 'I') {
          queue.put(n, queue.getOrDefault(n, 0)  + 1);
        } else {
          if (queue.size() == 0) continue;
          int num = n == 1 ? queue.lastKey() : queue.firstKey();
          if (queue.put(num, queue.get(num) -1 ) == 1) queue.remove(num);
        }
      }
      System.out.println(queue.size() == 0 ? "EMPTY" : queue.lastKey() + " " + queue.firstKey());
    }

  }

}
