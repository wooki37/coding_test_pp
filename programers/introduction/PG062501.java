
// 코딩테스트 연습/코딩테스트 입문/문자열 계산하기
class Solution {
  public int solution(String my_string) {
    int answer = 0;

    String[] s = my_string.split(" ");
    answer = Integer.parseInt(s[0]); // s[0]에는 초기값인 첫 번째 숫자가 저장됩니다

    for (int i = 1; i < s.length - 1; i++) { // for 반복문을 통해 s 배열의 두 번째 요소부터 끝에서 두 번째 요소까지 반복합니다.
      if (s[i].equals("+")) {
        answer += Integer.parseInt(s[i + 1]);
      } else if (s[i].equals("-")) {
        answer -= Integer.parseInt(s[i + 1]);
      }
    }
    return answer;
  }
}