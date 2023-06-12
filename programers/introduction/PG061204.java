// 코딩테스트 연습/코딩테스트 입문/피자 나눠먹기(3)

class Solution {
  public int solution(int slice, int n) {
    int answer = 0;

    if (n % slice == 0) {
      answer = n / slice;
    } else {
      answer = n / slice + 1;
    }
    return answer;
  }
}