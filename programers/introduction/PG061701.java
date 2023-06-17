// 코딩테스트 연습/코딩테스트 입문/배열 회전시키기

class Solution {
  public int[] solution(int[] numbers, String direction) {
    int[] answer = new int[numbers.length];

    switch (direction) {
      case "left":
        int temp1 = numbers[0]; // 매개변수로 들어온 배열의 첫번째 값을 저장
        for (int i = 0; i < numbers.length - 1; i++) {
          answer[i] = numbers[i + 1]; // 나머지 정수를 왼쪽으로 한칸씩 이동
        }
        answer[numbers.length - 1] = temp1; // 저장했던 첫번째 정수를 마지막 자리에 저장
        break;
      case "right":
        int temp2 = numbers[numbers.length - 1]; // 매개변수로 들어온 마지막 정수를 저장
        for (int i = numbers.length - 1; i > 0; i--) {
          answer[i] = numbers[i - 1]; // 나머지 정수를 오른쪽으로 한칸씩 이동
        }
        answer[0] = temp2; // 저장했던 마지막 정수를 첫번째 배열에 저장
        break;
    }
    return answer;
  }
}
