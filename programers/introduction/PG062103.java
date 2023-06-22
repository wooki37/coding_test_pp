
// 코딩테스트 연습/코딩테스트 입문/분수의 덧셈
class Solution {
  public int[] solution(int numer1, int denom1, int numer2, int denom2) {
    int numer = numer1 * denom2 + numer2 * denom1; // numer는 두 분수의 분자를 더한 값으로 초기화
    int denom = denom1 * denom2; // denom은 두 분수의 분모를 곱한 값으로 초기화
    int max = 1;

    // 반복문은 1부터 numer과 denom 중 작은 값까지 반복하며, denom과 numer이 모두 i로 나누어떨어지는지 확인합니다.
    // 만약 나누어떨어진다면 max 변수에 i 값을 저장합니다.
    for (int i = 1; i <= numer && i <= denom; i++) {
      if (denom % i == 0 && numer % i == 0) {
        max = i;
      }
    }
    // 최대공약수 max를 사용하여 numer와 denom을 기약분수로 만듭니다. 각각을 max로 나누어줍니다.
    numer = numer / max;
    denom = denom / max;

    int[] answer = { numer, denom };

    return answer;
  }
}
