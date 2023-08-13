class Solution {
    public int solution(int[][] board, int k) {
        int sum = 0;
        int rows = board.length;
        int cols = board[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i + j <= k) {
                    sum += board[i][j];
                }
            }
        }
        return sum;
    }
}