
// 코딩테스트 연습/코딩테스트 입문/한 번만 등장한 문자
import java.util.Arrays;

class Solution {
  public String solution(String s) {
    String answer = ""; // answer는 결과 문자열을 저장하는 변수이며, 초기값은 빈 문자열로 설정
    String[] arr = s.split(""); // arr은 문자열 s를 한 글자씩 분리하여 배열로 저장한 것
    int count = 0; // count는 문자의 등장 횟수를 세기 위한 변수

    Arrays.sort(arr); // arr 배열의 요소들을 사전순으로 정렬

    for (int i = 0; i < arr.length; i++) {
      count = 0;
      for (int j = 0; j < arr.length; j++) {
        if (arr[i].equals(arr[j])) {
          count++;
        }
      }
      if (count == 1) { // 내부 반복문이 종료되면 count의 값이 1인지 확인합니다.
        answer += arr[i]; // count가 1이라면 해당 문자는 중복되지 않는 문자이므로 answer에 추가
      }
    }
    return answer;
  }
}
