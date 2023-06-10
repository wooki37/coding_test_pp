// 코딩테스트 연습/코딩테스트 입문/문자열 뒤집기

class Solution {
  public String solution(String my_string) {
    String answer = "";

    for (int i = my_string.length() - 1; i >= 0; i--) {
      answer += my_string.charAt(i); // charAt : String 타입의 데이터(문자열)에서
                                     // 특정 문자를 char 타입으로 변환할 때 사용하는 함수
    }
    return answer;
  }
}