class Solution {
    public int solution(int[] num_list) {
        int oddSum = 0;
        int evenSum = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                evenSum += num_list[i];
            } else {
                oddSum += num_list[i];
            }
        }
        // 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 반환한다.
        return Math.max(evenSum, oddSum);
    }
}