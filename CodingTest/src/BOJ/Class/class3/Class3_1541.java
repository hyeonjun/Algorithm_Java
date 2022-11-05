package BOJ.Class.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Class3_1541 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), "-");
    ArrayList<Integer> nums = new ArrayList<>();
    while (st.hasMoreTokens()) {
      String str = st.nextToken();
      int count = 0;
      for (String s: str.split("\\+")) {
        count += Integer.parseInt(s);
      }
      nums.add(count);
    }
    int answer = nums.get(0);
    for (int i=1; i< nums.size(); i++) answer -= nums.get(i);
    System.out.println(answer);
  }
}
