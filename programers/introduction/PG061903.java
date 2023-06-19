
// 코딩테스트 연습/코딩테스트 입문/모스부호(1)
class Solution {
  public String solution(String letter) {
    String answer = "";
    // morseList 배열에 모스부호를 순서대로 넣어줌
    String[] morseList = {
        ".-", "-...", "-.-.", "-..", ".", "..-.",
        "--.", "....", "..", ".---", "-.-", ".-..",
        "--", "-.", "---", ".--.", "--.-", ".-.",
        "...", "-", "..-", "...-", ".--", "-..-",
        "-.--", "--.."
    };
    String[] morse; // 입력된 letter 문자열을 공백을 기준으로 분리하여 저장한 배열입니다.
    // 공백을 기준으로 편지의 모스부호를 나누어준 뒤, morse 배열에 넣어줌
    morse = letter.split(" ");
    /*
     * 편지 해독을 위해 morse 값과 morseList 값이 일치하는 index를 찾아 'a'를 더해줌(아스키 코드에 따라 '97'을 더해줘도
     * 가능)
     */
    for (String s : morse) {
      // morseList 배열을 검색하면서 s와 일치하는 모스 부호를 찾습니다.
      for (int i = 0; i < morseList.length; i++) {
        if (s.equals(morseList[i])) {
          // 일치하는 모스 부호를 찾았을 때, 해당 인덱스에 해당하는 영문 알파벳을 answer에 추가합니다.
          // Character.toString(i + 'a')를 사용하여 영문 알파벳으로 변환하여 answer에 추가합니다.
          answer += Character.toString(i + 'a');
        }
      }
    }
    return answer; // 해독된 편지를 return
  }
}
