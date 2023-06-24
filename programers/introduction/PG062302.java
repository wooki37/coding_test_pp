
// 코딩테스트 연습/코딩테스트 입문/공 던지기
class Solution {
  public int solution(int[] numbers, int k) {
    int answer = 0;
    int index = 0;

    for (int i = 1; i < k; i++) {
      index += 2;
    }
    index %= numbers.length;
    answer = numbers[index];

    return answer;
  }
}