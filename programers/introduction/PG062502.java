
// 코딩테스트 연습/코딩테스트 입문/구슬을 나누는 경우의 수
class Solution {
  public int solution(int balls, int share) {
    long answer = 1;
    int shareIndex = 1;
    for (int i = share + 1; i <= balls; i++) {
      answer *= i;
      answer /= shareIndex;
      shareIndex++;
    }

    return (int) answer;
  }
}