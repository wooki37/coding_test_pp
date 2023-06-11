// 코딩테스트 연습/코딩테스트 입문/최대값 만들기(1)

class Solution {
  public int solution(int[] n) {
    int answer = 0;
    int max = 0;

    for (int i = 0; i < n.length; i++) {
      for (int j = i + 1; j < n.length; j++) {
        if (n[i] * n[j] > max) {
          max = n[i] * n[j];
        }
      }
    }
    answer = max;
    return answer;
  }
}
