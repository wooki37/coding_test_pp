
// 코딩테스트 연습/코딩테스트 입문/등수 매기기
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class Solution {
  public int[] solution(int[][] score) {
    List<Integer> scoreList = new ArrayList<>();

    for (int[] t : score) {
      scoreList.add(t[0] + t[1]);
    }
    // 역순 정렬을 위한 비교자(Comparator)입니다. 이 비교자는 원소들을 내림차순으로 정렬하는 역할을 합니다.
    scoreList.sort(Comparator.reverseOrder());
    int[] answer = new int[score.length];
    for (int i = 0; i < score.length; i++) {
      answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
    }
    return answer;
  }
}