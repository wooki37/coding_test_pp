
// 코딩테스트 연습/코딩테스트 입문/
import java.util.Arrays;

class Solution {
  public String solution(String my_string) {
    String answer = ""; // 결과값을 저장할 문자열 answer를 선언하고 빈 문자열로 초기화
    // my_string을 소문자로 변환하고, 각 문자를 배열에 저장
    // my_string.toLowerCase()을 사용하여 문자열을 소문자로 변환하고,
    // split("")을 사용하여 문자열을 각각의 문자로 분리하여 배열 arr에 저장
    String[] arr = my_string.toLowerCase().split("");

    // 배열 arr을 알파벳 오름차순으로 정렬
    Arrays.sort(arr);

    // arr의 i번째 원소를 answer에 추가합니다. 이를 통해 알파벳이 오름차순으로 이어진 문자열이 구성
    for (int i = 0; i < arr.length; i++) {
      answer += arr[i];
    }
    return answer;
  }
}
