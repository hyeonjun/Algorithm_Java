package BOJ.Class.class1;

import java.io.*;
import java.util.*;

public class Class1_1157 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Map<Character, Integer> table = new HashMap<>();
        for (int i=0; i<str.length(); i++){
            Character s = Character.toLowerCase(str.charAt(i));
            if (table.containsKey(s)) {
                table.put(s, table.get(s)+1);
            } else table.put(s, 1);
        }
        int maxValue = Collections.max(table.values());
        Character answer = '0';
        for (Map.Entry<Character, Integer> m : table.entrySet()) {
            if (m.getValue() == maxValue) {
                if (!answer.equals('0')) {
                    answer = '?';
                    break;
                }
                answer = m.getKey();
            }
        }
        System.out.println(Character.toUpperCase(answer));
    }
}
