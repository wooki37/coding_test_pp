// 코딩테스트 연습/코딩테스트 입문/주사위의 개수

class Solution {
  public int solution(int[] box, int n) {
    int answer = 0;

    int w = box[0] / n;
    int d = box[1] / n;
    int h = box[2] / n;

    answer = w * d * h;

    return answer;
  }
}
