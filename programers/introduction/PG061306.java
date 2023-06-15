// 코딩테스트 연습/코딩테스트 입문/개미군단

class Solution {
  public int solution(int hp) {
    int answer = 0;

    int a = hp / 5; // hp 값을 5로 나눈 몫을 변수 a에 저장
    hp = hp % 5;  // hp 값을 5로 나눈 나머지를 다시 hp 변수에 저장
    int b = hp / 3; // hp 값을 3으로 나눈 몫을 변수 b에 저장
    hp = hp % 3;  // hp 값을 3으로 나눈 나머지를 다시 hp 변수에 저장

    answer = a + b + hp;

    return answer;
  }
}