
// 코딩테스트 연습/코딩테스트 입문/컨트롤 제트
class Solution {
  public int solution(String s) {
    String[] arr = s.split(" "); // 문자열 s를 공백을 기준으로 분리하여 String 배열인 arr에 저장
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals("Z")) {
        count -= Integer.parseInt(arr[i - 1]); // 만약 arr[i]가 "Z"라는 문자열과 같다면,
                                               // 이전 요소인 arr[i-1]을 정수로 변환하여 count에서 빼줍니다
        continue;
      }
      count += Integer.parseInt(arr[i]); // 그렇지 않은 경우, arr[i]를 정수로 변환하여 count에 더해줍니다.
    }
    return count;
  }
}
