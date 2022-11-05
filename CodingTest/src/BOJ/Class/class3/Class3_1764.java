package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Class3_1764 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
    Set<String> set = new HashSet<>();
    int count = 0;
    ArrayList<String> names = new ArrayList<>();
    for (int i=0; i<n; i++) set.add(br.readLine());
    for (int i=0; i<m; i++) {
      String name = br.readLine();
      if (set.contains(name)) {
        names.add(name);
        count++;
      }
    }
    System.out.println(count);
    names.stream().sorted().forEach(System.out::println);
  }
}
