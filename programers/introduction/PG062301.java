
// 코딩테스트 연습/코딩테스트 입문/소인수 분해
import java.util.LinkedHashSet;

class Solution {
  public int[] solution(int n) {
    // LinkedHashSet을 사용하여 중복을 제거하고 순서를 유지하는 Set을 생성
    LinkedHashSet<Integer> s = new LinkedHashSet<>();
    int i = 2;

    while (n > 1) {
      if (n % i == 0) {
        s.add(i);
        n /= i; // n을 i로 나누어 줍니다. 이는 i가 n의 소인수임을 의미하며, n을 업데이트하여 남은 값을 계산
      } else { // n이 i로 나누어지지 않는 경우, i는 n의 소인수가 아닙니다. 따라서 i를 1씩 증가시켜 다음 소인수를 찾습니다.
        i++;
      }
    }
    // LinkedHashSet인 s를 Stream으로 변환한 후 mapToInt를 사용하여 각 요소를 int 형식으로 변환합니다.
    // 마지막으로 toArray를 호출하여 int[] 배열로 반환합니다.
    return s.stream().mapToInt(Integer::intValue).toArray();
  }
}