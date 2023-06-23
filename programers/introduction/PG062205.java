
// 코딩테스트 연습/코딩테스트 입문/7의 개수
class Solution {
  public int solution(int[] array) {
    int answer = 0;

    for (int i = 0; i < array.length; i++) {
      String num = Integer.toString(array[i]); // 배열의 각 요소 array[i]를 문자열로 변환한 후 num에 저장합니다.
      String[] arr = num.split(""); // num을 문자열 배열로 변환하여 arr에 저장합니다. 각 문자열을 공백으로 분리

      for (int j = 0; j < arr.length; j++) {
        if (arr[j].equals("7"))
          answer++;
      }
    }
    return answer;
  }
}
