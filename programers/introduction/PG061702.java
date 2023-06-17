// 코딩테스트 연습/코딩테스트 입문/외계행성의 나이

class Solution {
  public String solution(int age) {
    String answer = ""; // 빈 문자열로 초기화된 answer 변수를 생성합니다.
    // 이 변수는 최종적으로 반환될 문자열을 저장할 예정입니다.
    String s = String.valueOf(age); // String.valueOf(age)를 사용하여 age를 문자열로 변환하고, s 변수에 저장
    String[] arr = s.split(""); // s.split("")을 통해 s를 각 자릿수별로 분리하여 String 배열인 arr에 저장

    for (int i = 0; i < arr.length; i++) {
      answer += ((char) ((Integer.parseInt(arr[i]) + 97))); // Integer.parseInt(arr[i])를 사용하여
      // arr의 i번째 요소를 정수로 변환한 후, 그 값에 97을 더합니다.
    }

    return answer;
  }
}
