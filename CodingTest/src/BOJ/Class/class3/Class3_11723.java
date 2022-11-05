package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Class3_11723 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

//    solution_set(n, br);
    solution_bitmask(n, br);
  }

  static void solution_set(int n, BufferedReader br) throws Exception {
    StringTokenizer st;
    Set<Integer> set = new HashSet<>();
    StringBuilder sb = new StringBuilder();
    while (n-- > 0) {
      st = new StringTokenizer(br.readLine(), " ");
      String cmd = st.nextToken();
      switch (cmd) {
        case "add":
          set.add(Integer.parseInt(st.nextToken()));
          break;
        case "remove":
          set.remove(Integer.parseInt(st.nextToken()));
          break;
        case "check":
          sb.append(set.contains(Integer.parseInt(st.nextToken())) ? 1 : 0).append("\n");
          break;
        case "toggle":
          int value = Integer.parseInt(st.nextToken());
          if (set.contains(value)) set.remove(value);
          else set.add(value);
          break;
        case "all":
          IntStream.range(1, 21).forEach(set::add);
          break;
        case "empty":
          set.clear();
          break;
        default:
          break;
      }
    }
    System.out.println(sb);
  }

  static void solution_bitmask(int n, BufferedReader br) throws Exception {
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    int bitset =0;
    while (n-- > 0) {
      st = new StringTokenizer(br.readLine(), " ");
      String cmd = st.nextToken();
      switch (cmd) {
        case "add":
          bitset |= (1 << Integer.parseInt(st.nextToken()));
          break;
        case "remove":
          bitset &= ~(1 << Integer.parseInt(st.nextToken()));
          break;
        case "check":
          sb.append((bitset & (1 << Integer.parseInt(st.nextToken()))) != 0 ? 1 : 0 ).append("\n");
          break;
        case "toggle":
          bitset ^= (1 << Integer.parseInt(st.nextToken()));
          break;
        case "all":
          bitset = (1 << 21) - 1;
          break;
        case "empty":
          bitset = 0;
          break;
        default:
          break;
      }
    }
    System.out.println(sb);
  }
}
