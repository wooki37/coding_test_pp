// 코딩테스트 연습/코딩테스트 입문/점의 위치 구하기

class Solution {
  public int solution(int[] dot) {
    int answer = 0;

    if (dot[0] > 0) {
      if (dot[1] > 0) {
        answer = 1;
      } else
        answer = 4;
    } else if (dot[1] > 0) {
      answer = 2;
    } else
      answer = 3;

    return answer;
  }
}