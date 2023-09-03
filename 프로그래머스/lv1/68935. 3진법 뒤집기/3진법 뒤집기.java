class Solution {
public int solution(int n) {
    String ternary = ""; // 3진법으로 변환한 문자열을 저장할 변수
    while (n > 0) {
        int remainder = n % 3;
        n /= 3;
        ternary = remainder + ternary; // 뒤집어서 저장
    }

    int decimal = 0; // 10진법으로 변환한 결과를 저장할 변수
    int power = 1;   // 3의 거듭제곱을 계산하기 위한 변수
    for (int i = 0; i < ternary.length(); i++) { // 문자열을 앞에서부터 처리하도록 수정
        int digit = ternary.charAt(i) - '0'; // 문자를 숫자로 변환
        decimal += digit * power;
        power *= 3;
    }

    return decimal;
}
}