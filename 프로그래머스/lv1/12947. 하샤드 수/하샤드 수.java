class Solution {
    public boolean solution(int x) {
        // 정수 x의 각 자릿수를 분리하여 합을 구함
        int digitSum = 0;
        int temp = x;
        while (temp > 0) {
            digitSum += temp % 10;
            temp /= 10;
        }
        // 정수 x를 합으로 나누어 떨어지는지 검사
        return x % digitSum == 0;

    }
}