// 코딩테스트 연습/코딩테스트 입문/배열 자르기

class Solution {
  public int[] solution(int[] numbers, int num1, int num2) {
    int[] answer = new int[num2 - num1 + 1];  // 배열의 크기, 추출할 요소들의 개수
    int k = 0;

    for (int i = num1; i <= num2; i++) {
      answer[k] = numbers[i];
      k++;
    }
    return answer;
  }
}