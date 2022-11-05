package BOJ.Class.class2;

import java.io.*;
import java.util.*;

public class Class2_4153 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            List<Integer> arr = new ArrayList<>();
            while (st.hasMoreTokens()) arr.add(Integer.parseInt(st.nextToken()));
            if (arr.stream().mapToInt(i -> i).sum() == 0) break;
            Collections.sort(arr);
            if (Math.pow(arr.get(0), 2) + Math.pow(arr.get(1), 2) == Math.pow(arr.get(2), 2)) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}
