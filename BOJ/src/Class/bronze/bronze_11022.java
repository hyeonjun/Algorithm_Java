package Class.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class bronze_11022 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    for(int i = 0; i < a; i++) {
      st = new StringTokenizer(br.readLine());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      bw.write(String.format("Case #%d: %d + %d = %d\n", i+1, b, c, b+c));
    }
    bw.close();
  }
}
