
// 코딩테스트 연습/코딩테스트 입문/K의 개수
class Solution {
  public int solution(int i, int j, int k) {
    int answer = 0;
    String strK = String.valueOf(k); // strK 변수에 정수 k를 문자열로 변환하여 저장합니다.

    for (int l = i; l <= j; l++) { // l을 i부터 j까지 반복합니다.
      String value = String.valueOf(l); // 현재 숫자 l을 문자열로 변환하여 value에 저장합니다.
      if (value.contains(strK)) { // value가 strK를 포함하고 있는지 확인합니다.
        // 개수 세기:
        // value가 strK를 포함하고 있다면, 해당 숫자에서 k의 개수를 세기 위해 아래 작업을 수행합니다.
        // value를 각 자리수로 분리하기 위해 split("")을 사용하여 문자열 배열 array를 생성합니다.
        // array의 각 요소 alpha에 대해서 아래 작업을 수행합니다.
        // alpha가 strK와 같다면, answer를 1 증가시킵니다.
        String[] array = value.split("");
        for (String alpha : array) {
          if (alpha.equals(strK))
            answer++;
        }
      }
    }
    return answer;
  }
}
