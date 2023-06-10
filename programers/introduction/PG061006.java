// 코딩테스트 연습/코딩테스트 입문/순서쌍의 개수

class Solution {
  public int solution(int n) {
    int answer = 0;

    for (int i = 1; i <= n; i++) {
      if (n % i == 0) { // i가 n의 약수인지 확인합니다. n을 i로 나눈 나머지가 0이면 i는 n의 약수입니다.
        answer++;
      }
    }
    return answer;
  }
}
// * 헷갈린점
// i가 0부터 시작하는 경우: i가 0일 때, n을 i로 나누는 연산은 0으로 나누는 것이 되므로 오류가 발생합니다
// 반복 범위 조건: for 루프의 반복 범위는 i가 n까지 증가하도록 설정해야 합니다.
// i를 0부터 시작하는 경우, 반복 범위는 i <= n으로 설정해야 합니다