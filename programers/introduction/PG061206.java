// 코딩테스트 연습/코딩테스트 입문/자릿수 더하기

class Solution {
  public int solution(int n) {
    int answer = 0;

    while (n > 0) {
      answer += n % 10;
      n /= 10;
    }
    return answer;
  }
}