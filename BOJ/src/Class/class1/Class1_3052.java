package Class.class1;

import java.io.*;
import java.util.*;

public class Class1_3052 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> answer = new HashSet<>();
        for (int i=0; i<10; i++) {
            answer.add(Integer.parseInt(br.readLine()) % 42);
        }
        System.out.println(answer.size());
    }
}
