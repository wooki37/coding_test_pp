// 코딩테스트 연습/코딩테스트 입문/배열 원소의 길이

class Solution {
  public int[] solution(String[] strlist) {
    int[] answer = new int[strlist.length];

    for (int i = 0; i < strlist.length; i++) {
      answer[i] = strlist[i].length();
    }
    return answer;
  }
}
