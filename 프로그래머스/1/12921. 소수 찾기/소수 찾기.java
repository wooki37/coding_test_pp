class Solution {
    public int solution(int n) {
        // 2는 소수이기 때문에 초기값을 1로 설정
        int answer = 1;
        
        // 3부터 n까지 반복하여 소수를 찾기
        for (int i = 3; i <= n; i++) {
            if (isPrime(i)) answer += 1;
        }
        
        return answer;
    }
    // 소수 판별 메서드
    private Boolean isPrime(int num) {
        // 2부터 n의 제곱근까지 반복
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            // num이 i로 나눈 나머지가 0이면 소수가 아님
            if (num % i == 0) {
                return false;
            } 
        }
        // 반복문을 무사히 마치면 true
        return true;
    }
}