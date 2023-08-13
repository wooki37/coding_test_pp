class Solution {
    public int solution(int[][] arr) {
        int n = arr.length;    // 이차원 배열의 크기
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return 0;   // 대칭이 아니면 0을 반환
                }
            }
        }
        
        return 1;   // 대칭이면 1을 반환
    }
}