package Class;

import java.io.*;
import java.util.StringTokenizer;;

public class test2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int a = Integer.parseInt(st.nextToken());

    sb.append(a);
    System.out.println(sb);
  }

}
