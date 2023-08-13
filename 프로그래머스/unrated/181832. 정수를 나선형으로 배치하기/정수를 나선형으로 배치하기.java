public class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];  // 결과 배열 초기화
        int num = 1;  // 현재 채울 숫자

        int row_start = 0, row_end = n - 1, col_start = 0, col_end = n - 1;  // 각 행과 열의 시작, 끝 인덱스

        while (num <= n * n) {
            // 위쪽 행
            for (int col = col_start; col <= col_end; col++) {
                answer[row_start][col] = num++;
            }
            row_start++;

            // 오른쪽 열
            for (int row = row_start; row <= row_end; row++) {
                answer[row][col_end] = num++;
            }
            col_end--;

            // 아래쪽 행
            if (row_start <= row_end) {
                for (int col = col_end; col >= col_start; col--) {
                    answer[row_end][col] = num++;
                }
                row_end--;
            }

            // 왼쪽 열
            if (col_start <= col_end) {
                for (int row = row_end; row >= row_start; row--) {
                    answer[row][col_start] = num++;
                }
                col_start++;
            }
        }

        return answer;
    }
}