// 코딩테스트 연습/코딩테스트 입문/숫자 찾기

class Solution {
  public int solution(int num, int k) {
    int answer = 0;
    // num을 문자열로 변환하고, 각 자릿수를 배열에 저장합니다.
    // 이를 위해 String.valueOf(num)을 사용하여 num을 문자열로 변환하고,
    // split("")을 사용하여 문자열을 각각의 문자로 분리하여 배열 s에 저장합니다.
    String[] s = String.valueOf(num).split("");

    for (int i = 0; i < s.length; i++) {
      // 배열 s의 i번째 원소가 k와 동일한지 확인합니다. 즉, 해당 자릿수의 숫자가 k와 일치하는지 검사합니다.
      // answer = i + 1;: k가 처음으로 등장하는 위치를 나타내는 answer에 i + 1 값을 저장합니다.
      // 여기서 i + 1은 1부터 시작하는 위치를 의미합니다. (배열 인덱스는 0부터 시작하기 때문에)
      // break;: k를 찾았으므로 반복문을 종료합니다.
      if (s[i].equals(String.valueOf(k))) {
        answer = i + 1;
        break;
      } else {
        answer = -1; // k가 숫자 num에 존재하지 않는 경우
      }
    }
    return answer;
  }
}
