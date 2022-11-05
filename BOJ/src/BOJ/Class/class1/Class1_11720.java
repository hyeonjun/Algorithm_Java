package BOJ.Class.class1;

import java.io.*;

public class Class1_11720 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int answer = 0;
        for (byte v : br.readLine().getBytes()) {
            answer += v - '0'; // UTF-16 인코딩에 맞게 각 문자의 값을 저장하므로 '0' 또는 48를 빼줘야함
        }
        System.out.println(answer);
    }
}
