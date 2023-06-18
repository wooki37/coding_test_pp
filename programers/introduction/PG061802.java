// 코딩테스트 연습/코딩테스트 입문/약수 구하기

class Solution {
  public int[] solution(int n) {
    int[] answer;
    int j = 0;
    int count = 0;

    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        count++;
      }
    }
    answer = new int[count];

    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        answer[j] = i;
        j++;
      }
    }
    return answer;
  }
}
