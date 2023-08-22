class Solution {
    public long solution(int a, int b) {
        // a와 b 중에서 더 작은 값과 더 큰 값을 찾음
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        
        // 작은 값부터 큰 값까지의 모든 정수를 더하여 합을 계산
        long sum = 0L;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }
}