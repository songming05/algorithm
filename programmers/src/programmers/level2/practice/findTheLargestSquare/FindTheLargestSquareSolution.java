package programmers.level2.practice.findTheLargestSquare;

public class FindTheLargestSquareSolution {

    public static FindTheLargestSquareSolution newInstance() {
        return new FindTheLargestSquareSolution();
    }

    public int solution(int[][] board) {
        int answer = 0;

//        int maxWidth = board.length >= board[0].length ? board.length : board[0].length;
//
//        int countOne = 0;
//        int countRow = 0;
//        for (int i = 0; i < board.length; i++) {
//            countOne = 0;
//            for (int j = 0; j < board[i].length; j++) {
//                if(board[i][j] == 1) countOne++;
//            }
//        }

        int[][] dp = new int[1001][1001];
        int row = board.length;
        int col = board[0].length;
        for (int i = 1; i <= row; ++i) {
            for (int j = 1; j <= col; ++j) {
                if(board[i-1][j-1] != 0 ) {
                    dp[i][j] = Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1])) + 1;
                    answer = Math.max(answer, dp[i][j]);
                }
            }
        }

        return answer * answer;
    }
}
