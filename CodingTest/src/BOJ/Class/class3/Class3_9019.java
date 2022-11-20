package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Class3_9019 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      System.out.println(bfs(a, b));
    }
  }

  private static String bfs(int a, int b) {
    ArrayDeque<Data> queue = new ArrayDeque<>();
    queue.add(new Data(a, ""));
    boolean[] visited = new boolean[10001];
    visited[a] = true;

    while(!queue.isEmpty()) {
      Data data = queue.pollFirst();

      if (data.num == b) {
        return data.command;
      }

      int numD = data.D();
      if (!visited[numD]) {
        queue.add(new Data(numD, data.command + "D"));
        visited[numD] = true;
      }

      int numS = data.S();
      if (!visited[numS]) {
        queue.add(new Data(numS, data.command + "S"));
        visited[numS] = true;
      }

      int numL = data.L();
      if (!visited[numL]) {
        queue.add(new Data(numL, data.command + "L"));
        visited[numL] = true;
      }

      int numR = data.R();
      if (!visited[numR]) {
        queue.add(new Data(numR, data.command + "R"));
        visited[numR] = true;
      }
    }
    return "";
  }

  static class Data {

    private int num;
    private String command;

    public Data(int num, String command) {
      this.num = num;
      this.command = command;
    }

    public int D() {
      return (num * 2) % 10000;
    }

    public int S() {
      return num == 0 ? 9999 : num-1;
    }

    public int L() {
      return num % 1000 * 10 + num / 1000;
    }

    public int R() {
      return num % 10 * 1000 + num / 10;
    }

  }
}
