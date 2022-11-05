package BOJ.Class.class1;

import java.io.*;
import java.util.*;

public class Class1_2920 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<8; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        if (arr.equals(sort(arr))) System.out.println("ascending");
        else if (arr.equals(reverseSort(arr))) System.out.println("descending");
        else System.out.println("mixed");
    }

    static List<Integer> sort(List<Integer> arr) {
        List<Integer> sort = new ArrayList<>(arr);
        Collections.sort(sort);
        return sort;
    }

    static List<Integer> reverseSort(List<Integer> arr) {
        List<Integer> reserveSort = new ArrayList<>(arr);
        reserveSort.sort(Collections.reverseOrder());
        return reserveSort;
    }
}
