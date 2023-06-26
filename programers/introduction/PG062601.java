
// 코딩테스트 연습/코딩테스트 입문/외계어 사전
class Solution {
  public int solution(String[] spell, String[] dic) {
    // wordCheck 변수를 초기값 false로 설정합니다. 이 변수는 외계어 사전에 속하는 단어가 존재하는지 여부를 나타냅니다.
    boolean wordCheck = false;

    for (String word : dic) {
      int count = 0;
      // 내부 반복문에서 spell 배열을 순회하면서 현재 단어가 해당 외계어 단어에 포함되어 있는지 확인합니다.
      // 만약 포함되어 있다면 count 변수를 증가시킵니다.
      for (String s : spell) {
        if (word.contains(s))
          count++;
      }
      // 내부 반복문이 종료되고 count 값이 spell 배열의 길이와 동일하다면,
      // 외계어 사전에 모든 단어가 포함되어 있는 것이므로 wordCheck 값을 true로 설정하고 반복문을 종료합니다.
      if (count == spell.length) {
        // 반복문이 종료된 후, wordCheck 값이 true라면 외계어 사전에 속하는 것이므로 1을 반환합니다.
        // 그렇지 않다면 외계어 사전에 속하지 않는 것이므로 2를 반환합니다.
        wordCheck = true;
        break;
      }
    }
    return wordCheck ? 1 : 2;
  }
}