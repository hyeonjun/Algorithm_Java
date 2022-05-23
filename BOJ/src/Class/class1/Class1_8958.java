package Class.class1;

import java.io.*;

public class Class1_8958 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            String ox = br.readLine();
            int cnt = 0;
            int score = 0;
            for (int j=0; j<ox.length(); j++) {
                String c = String.valueOf(ox.charAt(j));
                if (c.equals("O")) cnt += 1;
                else cnt = 0;
                score += cnt;
            }
            System.out.println(score);
        }
    }
}