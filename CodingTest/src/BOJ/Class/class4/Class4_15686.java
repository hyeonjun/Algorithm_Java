package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Class4_15686 {

  static int n, m;
  static int[][] board;
  static List<int[]> chicken = new ArrayList<>();
  static List<int[]> house = new ArrayList<>();

  static List<List<Integer>> comb = new ArrayList<>();
  static boolean[] visited;
  static long min = Long.MAX_VALUE;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    board = new int[n][n];
    for (int i=0; i<n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j=0; j<n; j++) {
        int x = Integer.parseInt(st.nextToken());
        board[i][j] = x;
        if (x == 1) {
          house.add(new int[] {i, j});
        } else if (x == 2) {
          chicken.add(new int[] {i, j});
        }
      }
    }

    visited = new boolean[chicken.size()];
    combination(0, chicken.size(), 0);
    calc();
    System.out.println(min);
  }

  private static void calc() {
    for (List<Integer> arr : comb) {
      long tmp = 0;
      List<Integer> distance;
      for (int[] h : house) {
        distance = new ArrayList<>();
        for (int i : arr) {
          distance.add(
            Math.abs(h[0]-chicken.get(i)[0])+ Math.abs(h[1]-chicken.get(i)[1]));
        }
        tmp += Collections.min(distance);
      }
      min = Math.min(min, tmp);
    }
  }

  private static void combination(int start, int k, int depth) {
    if (depth == m) {
      List<Integer> result = new ArrayList<>();
      for (int i=0; i<k; i++) {
        if (visited[i]) {
          result.add(i);
        }
      }
      comb.add(result);
      return;
    }

    for (int i=start; i<k; i++) {
      visited[i] = true;
      combination(i+1, k, depth+1);
      visited[i] = false;
    }
  }
}
