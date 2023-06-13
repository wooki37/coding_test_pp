// 코딩테스트 연습/코딩테스트 입문/개미군단

class Solution {
  public int solution(int hp) {
    int answer = 0;

    int a = hp / 5;
    hp = hp % 5;
    int b = hp / 3;
    hp = hp % 3;

    answer = a + b + hp;

    return answer;
  }
}