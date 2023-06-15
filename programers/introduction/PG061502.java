// 코딩테스트 연습/코딩테스트 입문/직각삼각형 출력하기

import java.util.Arrays;

class Solution {
  public int solution(int[] numbers) {
    int answer = 0;
    int mnum, pnum;

    Arrays.sort(numbers);

    mnum = numbers[0] * numbers[1];
    pnum = numbers[numbers.length - 1] * numbers[numbers.length - 2];
    answer = Math.max(mnum, pnum);

    return answer;
  }
}
