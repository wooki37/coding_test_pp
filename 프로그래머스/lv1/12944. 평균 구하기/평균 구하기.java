class Solution {
    public double solution(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        
        double answer = (double) totalSum / arr.length;
        return answer;
    }
}