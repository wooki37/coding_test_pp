class Solution {
    public long solution(long n) {
        long answer = (long) Math.sqrt(n);  //n의 제곱근을 정수형으로 계산
        if (answer * answer == n) {   //n이 answer의 제곱이면
            return (answer + 1) * (answer + 1);
        } else {
            return -1;
        }
    }
}