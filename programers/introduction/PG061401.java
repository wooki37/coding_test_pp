// 코딩테스트 연습/코딩테스트 입문/암호 해독

class Solution {
  public String solution(String cipher, int code) {
    String answer = "";
    String[] s = cipher.split(""); // 주어진 암호문 cipher를 각각의 문자로 분할하여 문자열 배열 s에 저장
                                   // s 배열에는 암호문의 각 문자가 저장
    for (int i = 0; i < s.length; i++) { // s 배열을 반복하면서 각 문자에 접근
      if ((i + 1) % code == 0) { // 현재 인덱스 i에 1을 더한 값을 code로 나누었을 때 나머지가 0인지 확인합니다.
                                 // 이는 현재 인덱스가 code의 배수 번째를 의미
        answer += s[i]; // 만약 현재 인덱스가 code의 배수 번째라면, 해당 문자를 answer에 추가합니다. 이렇게 하면 추출된 문자들이 answer에 누적
      }
    }
    return answer;
  }
}