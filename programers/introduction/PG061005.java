// 코딩테스트 연습/코딩테스트 입문/중앙값 구하기

class Solution {
  public int solution(int[] array) {
    int answer = 0;

    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[i]) { // array[j]가 현재 요소 array[i]보다 작다면, 두 요소의 위치를 교환합니다.
          answer = array[j]; // 이는 선택 정렬 알고리즘의 일부로서, 작은 값을 왼쪽으로 이동시킵니다.
          array[j] = array[i];
          array[i] = answer;
        }
      }
    } // 바깥쪽 for 루프를 통해 배열의 모든 요소에 대해 위의 비교 및 교환 과정을 수행합니다.
      // 이를 통해 배열은 작은 값이 왼쪽으로 정렬됩니다.
    int mid = array.length / 2; // 배열의 중간 위치(array.length / 2)에 해당하는 값을 변수 mid에 저장합니다.
                                // 배열의 길이가 홀수일 경우 중간에 해당하는 값이 됩니다.
    return array[mid];
  }
}