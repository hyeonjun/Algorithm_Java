package BOJ.Class.class2;

import java.io.*;
import java.util.*;

public class Class2_1018 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
        String[] board = new String[n];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            board[i] = st.nextToken();
        }
        long answer = Integer.MAX_VALUE;
        for (int r=0; r<n-7; r++) {
            for (int c=0; c<m-7; c++) {
                int b =0, w=0;
                for (int i=r; i<r+8; i++) {
                    for (int j=c; j<c+8; j++) {
                        if ((i+j) % 2 == 0) {
                            if (board[i].charAt(j) != 'B') b++;
                            if (board[i].charAt(j) != 'W') w++;
                        } else {
                            if (board[i].charAt(j) != 'B') w++;
                            if (board[i].charAt(j) != 'W') b++;
                        }
                    }
                }
                answer = Math.min(Math.min(b, w), answer);
            }
        }
        System.out.println(answer);
    }
}
