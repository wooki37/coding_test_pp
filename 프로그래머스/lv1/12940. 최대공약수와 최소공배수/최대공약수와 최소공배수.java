class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        // 1. 최대공약수(GCD) 구하기
        int gcd = getGCD(n, m);
        answer[0] = gcd;
        
        // 2. 최소공배수(LCM) 구하기
        int lcm = (n * m) / gcd;
        answer[1] = lcm;
        
        return answer;
    }
    // 최대공약수(GCD)를 구하는 함수
    private int getGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}