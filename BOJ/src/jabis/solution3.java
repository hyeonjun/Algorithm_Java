package jabis;

public class solution3 {

  public static void main(String[] args) {
    String[] board = {"EEEEE", "EEMEE", "EEEEE", "EEEEE"};
    System.out.println(solution(board, 2, 0));
  }

  public static String[] solution(String[] board, int y, int x) {
    String[] answer = {};
    int N = board.length, M = board[0].length();
    int i, j, ii, jj, n;
    for(i=0;i<N;i++){ //연산 및 출력 함께
      for(j=0;j<M;j++)
        if (board[i].charAt(j) == '*') {
          System.out.print(board[i].charAt(j));
        } else {
          for (n = 0, ii = (i > 0) ? i - 1 : 0; ii <= i + 1 && ii <= N - 1; ii++)
            for (jj = (j > 0) ? j - 1 : 0; jj <= j + 1 && jj <= M - 1; jj++)
              if (board[ii].charAt(jj) == 'M')
                n++; //동서남북대각선 8개칸에서 지뢰 세기
          System.out.print(n);
        }
      System.out.println();
    }




    return answer;
  }
}
