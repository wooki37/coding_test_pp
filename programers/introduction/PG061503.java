// 코딩테스트 연습/코딩테스트 입문/문자열 정렬하기(1)

import java.util.Arrays;

class Solution {
  public int[] solution(String my_string) {
    String[] arr = my_string.replaceAll("[^0-9]", "").split("");

    Arrays.sort(arr);

    int[] answer = new int[arr.length];

    for (int i = 0; i < answer.length; i++) {
      answer[i] = Integer.parseInt(arr[i]);
    }
    return answer;
  }
}
