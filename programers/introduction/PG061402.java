// 코딩테스트 연습/코딩테스트 입문/대문자와 소문자

class Solution {
  public String solution(String my_string) {
    String answer = "";

    for (int i = 0; i < my_string.length(); i++) {
      if (Character.isUpperCase(my_string.charAt(i))) { // 현재 인덱스 i에 해당하는 문자가 대문자인지 확인
        // 현재 인덱스의 문자가 대문자인 경우, 해당 문자를 소문자로 변환하여 answer에 추가
        answer += Character.toLowerCase(my_string.charAt(i));
      } else { // 대문자가 아닌 경우(소문자인 경우),
        // 현재 인덱스의 문자를 대문자로 변환하여 answer에 추가
        answer += Character.toUpperCase(my_string.charAt(i));
      }
    }
    return answer; // 반복이 끝나면 대소문자가 변환된 문자열 answer를 반환
  }
}

// Character.isUpperCase() 메서드는 주어진 문자가 대문자인지 여부를 판단
