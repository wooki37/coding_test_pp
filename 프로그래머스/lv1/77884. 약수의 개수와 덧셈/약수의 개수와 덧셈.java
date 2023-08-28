class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int num = left; num <= right; num++) {
            int divisors = countDivisors(num);
            if (divisors % 2 == 0) {
                answer += num;
            } else {
                answer -= num;
            }
        }
        return answer;
    }
    private int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (i * i == num) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}