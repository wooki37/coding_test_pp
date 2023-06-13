// 코딩테스트 연습/코딩테스트 입문/제곱수 판별하기

class Solution {
  public int solution(int n) {
    int answer = 0;

    for (int i = 1; i <= n; i++) {
      if (i * i == n) {
        answer = 1;
      }
    }
    if (answer != 1) {
      answer = 2;
    }

    return answer;
  }
}