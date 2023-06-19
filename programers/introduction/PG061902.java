
// 코딩테스트 연습/코딩테스트 입문/중복된 문자 제거
class Solution {
  public String solution(String my_string) {
    String answer = "";

    for (int i = 0; i < my_string.length(); i++) {
      // 문자열의 각 문자에 접근하여 중복 여부를 확인하고 answer에 추가합니다.
      // answer에 현재 문자가 이미 포함되어 있는지 확인하기 위해 contains 메서드를 사용합니다.
      // 만약 answer에 현재 문자가 포함되어 있지 않다면, 중복되지 않은 문자이므로 answer에 해당 문자를 추가합니다.
      if (!answer.contains(String.valueOf(my_string.charAt(i)))) {
        answer += my_string.charAt(i);
      }
    }
    return answer;
  }
}
