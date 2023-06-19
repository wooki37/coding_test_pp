
// 코딩테스트 연습/코딩테스트 입문/합성수 찾기
class Solution {
  public int solution(int n) {
    int answer = 0;

    for (int i = 1; i <= n; i++) { // i를 기준으로 약수의 개수를 세는 작업을 수행합니다
      int count = 0;
      for (int j = 1; j <= n; j++) {
        if (i % j == 0) { // i를 j로 나누어 나머지가 0이면 j는 i의 약수이므로 count 변수를 증가시킵니다.
          count++;
        }
      }
      if (count >= 3) { // 안쪽 for 루프가 종료된 후 count 변수의 값을 확인합니다.
                        // count 값이 3 이상인 경우, 즉 약수의 개수가 3개 이상인 경우 answer 값을 증가시킵니다.
        answer++;
      }
    }
    return answer;
  }
}
