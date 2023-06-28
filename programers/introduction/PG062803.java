
// 코딩테스트 연습/코딩테스트 입문/유한소수 판별하기
import java.util.ArrayList;
import java.util.List;

class Solution {
  public int solution(int a, int b) {
    int answer = 0;

    for (int i = 2; i <= a; i++) {
      if (a % i == 0 && b % i == 0) {
        answer = i;
      }
    }
    if (answer != 0) {
      b /= answer;
    }
    List<Integer> answerArr = new ArrayList<>();

    for (int i = 2; i < 1000; i++) {
      if (b % i == 0) {
        answerArr.add(i);
        b /= i;
        i--;
        if (b < 2) {
          break;
        }
      }
    }
    answerArr.removeIf(value -> value == 2 || value == 5);
    if (answerArr.size() == 0) {
      return 1;
    }
    return 2;
  }
}