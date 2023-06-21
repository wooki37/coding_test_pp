
// 코딩테스트 연습/코딩테스트 입문/진료순서 정하기
class Solution {
  public int[] solution(int[] emergency) {
    int[] answer = new int[emergency.length];

    // 배열 값 비교, 자신보다 응급도가 높은 값이 있으면 순서 배열에 +1해줌
    for (int i = 0; i < emergency.length; i++) {
      for (int j = 0; j < emergency.length; j++) {
        if (emergency[i] < emergency[j]) {
          answer[i]++;
        }
      }
      // 순서배열의 모든 닶에 +1 해줌(순서를 나타내야 하기 때문에 0이 아닌 1부터 하기 위함)
      answer[i]++;
    }
    return answer;
  }
}
