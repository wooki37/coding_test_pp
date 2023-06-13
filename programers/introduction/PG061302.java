// 코딩테스트 연습/코딩테스트 입문/숨어있는 숫자의 것셈 (1)

class Solution {
  public int solution(String my_string) {
    String arr[] = my_string.replaceAll("[^0-9]", "").split("");
    int answer = 0;

    for (int i = 0; i < arr.length; i++) {
      answer += Integer.parseInt(arr[i]);
    }
    return answer;
  }
}