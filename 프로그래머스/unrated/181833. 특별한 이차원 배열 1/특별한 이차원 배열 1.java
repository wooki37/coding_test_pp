class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;    // 대각선 요소에 1 할당
        }
        
        return answer;
    }
}