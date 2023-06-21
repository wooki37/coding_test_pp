
// 코딩테스트 연습/코딩테스트 입문/A로 B 만들기
import java.util.Arrays;

class Solution {
  public int solution(String before, String after) {
    int answer = 0;
    char[] beforec = before.toCharArray();
    char[] afterc = after.toCharArray();

    Arrays.sort(beforec);
    Arrays.sort(afterc);

    String bec = new String(beforec);
    String afc = new String(afterc);

    if (bec.equals(afc)) {
      return 1;
    } else {
      return 0;
    }
  }
}
