
class Solution {
    public int[][] solution(int[][] arr) {
        int rows = arr.length;  // 행의 수
        int cols = arr[0].length;   // 열의 수
        int maxDim = Math.max(rows, cols);  // 더 큰 값으로 크기를 맞출 예정
        
        // 크기를 늘린 새로운 배열을 생성하고 기존 배열의 값을 복사
        int[][] newArr = new int[maxDim][maxDim];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newArr[i][j] = arr[i][j];
            }
        }
        return newArr;
    }
}