// 코딩테스트 연습/코딩테스트 입문/369게임

class Solution {
  public int solution(int order) {
    int answer = 0; // 결과값을 저장할 정수형 변수 answer를 선언하고 0으로 초기화합니다.
    int count = 0; // 3, 6, 9 숫자의 개수를 세기 위한 변수 count를 선언하고 0으로 초기화합니다.

    while (order != 0) { // order가 0이 아닐 때까지 반복합니다.
      // order를 10으로 나눈 나머지가 3, 6, 9 중 하나인지 확인합니다.
      // 즉, order의 일의 자리 숫자가 3, 6, 9 중 하나인지 검사합니다.
      if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9) {
        count++; // order의 일의 자리 숫자가 3, 6, 9 중 하나인 경우 count를 증가시킵니다.
      }
      // order를 10으로 나눈 몫을 새로운 order로 갱신합니다. 즉, order의 일의 자리 숫자를 없애고 다음 자리로 이동합니다.
      order = order / 10;
    }
    answer = count;
    return answer;
  }
}

// 코드는 주어진 숫자 order에서 3, 6, 9 숫자의 개수를 구하기 위해 숫자를 일의 자리부터 확인하며
// 3, 6, 9 숫자인 경우 count를 증가시킵니다. 이후 count 값을 반환합니다.
