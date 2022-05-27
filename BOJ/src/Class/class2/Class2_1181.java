package Class.class2;

import java.io.*;
import java.util.*;

public class Class2_1181 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> arr = new HashSet<>();
        for (int i=0; i<n; i++) {
            arr.add(br.readLine());
        }
        Comparator<String> comparator = Comparator
                        .comparing(String::length)
                        .thenComparing(String::compareTo);
        arr.stream().sorted(comparator).forEach(System.out::println);
    }
}
