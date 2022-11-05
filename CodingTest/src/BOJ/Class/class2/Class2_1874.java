package BOJ.Class.class2;

import java.io.*;
import java.util.*;

public class Class2_1874 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder answer = new StringBuilder();
        int d = 0;
        boolean flag = true;
        for (int i=0; i<n; i++) {
            int x = Integer.parseInt(br.readLine());
            while (d < x) {
                d++;
                stack.push(d);
                answer.append("+\n");
            }
            if (stack.peek() == x) {
                stack.pop();
                answer.append("-\n");
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(answer);
        } else System.out.println("NO");
    }
}
