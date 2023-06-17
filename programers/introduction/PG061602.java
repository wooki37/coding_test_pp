// 코딩테스트 연습/코딩테스트 입문/인덱스 바꾸기

class Solution {
  public String solution(String my_string, int num1, int num2) {
    char[] charArr = my_string.toCharArray(); // String 문자열의 길이를 chArr배열에 저장

    charArr[num1] = my_string.charAt(num2); // 인덱스 num1 자리에 num2값을 대입
    charArr[num2] = my_string.charAt(num1); // 인덱스 num2 자리에 num1값을 대입

    return String.valueOf(charArr); // char배열을 String 문자열로 변환
  }
}
