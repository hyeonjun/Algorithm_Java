package Class.class2;

import java.io.*;

public class Class2_2292 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int floor=1, cnt=1; // cnt: 해당 층에 몇 개의 방이 있는지 -> 1, 6, 12, 18, 24, 30, ...
        while (n > cnt) {
            cnt += 6 * floor;
            floor += 1;
        }
        System.out.println(floor);
    }
}
