
// 코딩테스트 연습/코딩테스트 입문/이진수 더하기
class Solution {
  public String solution(String bin1, String bin2) {
    String answer = ""; // answer는 결과를 저장하는 변수이며, 초기값은 빈 문자열로 설정됩니다.
    // Integer.parseInt(bin1, 2)와 Integer.parseInt(bin2, 2)를 사용하여
    // bin1과 bin2를 이진수로 해석하여 정수로 변환한 후, 두 정수를 더합니다.
    // Integer.toBinaryString(...)은 정수를 이진수로 변환하는 메서드입니다.
    // 이진수로 변환된 합계 정수를 toBinaryString(...)을 사용하여 다시 이진수 문자열로 변환합니다.
    answer = Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));

    return answer;
  }
}
