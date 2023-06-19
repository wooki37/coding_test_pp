
// 코딩테스트 연습/코딩테스트 입문/2차원으로 만들기
class Solution {
  public int[][] solution(int[] num_list, int n) {
    // num_list.length / n 개수의 행과 n 개수의 열로 이루어진 2차원 배열입니다.
    // num_list의 요소들을 순서대로 할당하여 저장할 공간입니다.
    int[][] answer = new int[num_list.length / n][n];
    // num_list 배열의 요소를 순서대로 접근하기 위한 변수입니다.
    // count 변수는 num_list 배열의 인덱스를 나타냅니다.
    int count = 0;

    // 외부 for 루프는 answer 배열의 각 행을 순차적으로 처리합니다.
    // 내부 for 루프는 answer 배열의 각 행의 열을 순차적으로 처리합니다.
    // answer[i][j]에 num_list[count]의 값을 할당합니다.
    // count 변수를 증가시켜 다음 num_list의 요소에 접근합니다.
    for (int i = 0; i < num_list.length / n; i++) {
      for (int j = 0; j < n; j++) {
        answer[i][j] = num_list[count];
        count++;
      }
    }
    return answer;
  }
}
