// 코딩테스트 연습/코딩테스트 입문/가장 큰 수 찾기

class Solution {
  public int[] solution(int[] array) {
    int[] answer = new int[2]; // 이 배열은 최댓값과 해당 최댓값의 인덱스를 저장

    int max = array[0]; // array의 첫번째 정수를 임의의 max로 저장
    int index = 0; // 현재까지의 최댓값이 위치한 인덱스를 저장할 변수

    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) { // 현재 요소 array[i]가 max보다 크다면, max 값을 array[i]로 업데이트하고,
        // index를 i로 설정합니다. 즉, 더 큰 값을 발견하면 max와 index를 갱신
        max = array[i];
        index = i;
      }
    }
    answer[0] = max;
    answer[1] = index;

    return answer;
  }
}
