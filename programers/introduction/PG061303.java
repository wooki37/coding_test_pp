// 코딩테스트 연습/코딩테스트 입문/짝수는 싫어요

class Solution {
  public int[] solution(int n) {
    int[] answer = new int[(n + 1) / 2];

    for (int i = 1; i <= n; i++) {
      if (i % 2 == 1) {
        answer[i / 2] = i;
      }
    }
    return answer;
  }
}