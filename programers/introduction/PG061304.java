// 코딩테스트 연습/코딩테스트 입문/문자열안에 문자열

class Solution {
  public int solution(String str1, String str2) {
    int answer = 0;
    if (str1.contains(str2)) { // 문자열 안에 특정 문자열이 포함되어 있는지를 확인하는 메서드
      answer = 1;
    } else {
      answer = 2;
    }
    return answer;
  }
}