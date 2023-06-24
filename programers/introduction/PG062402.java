
// 코딩테스트 연습/코딩테스트 입문/잘라서 배열로 저장하기
import java.util.ArrayList;

class Solution {
  public String[] solution(String my_str, int n) {
    int length = 0; // length는 잘라진 부분 문자열의 개수
    int count = 0; // count는 마지막 부분 문자열의 인덱스를 나타내기 위해 사용

    // my_str의 길이를 n으로 나누었을 때 나머지에 따라 length 값을 설정
    if (my_str.length() % n == 0) {
      length = my_str.length() / n;
    } else if (my_str.length() % n != 0) {
      length = my_str.length() / n + 1;
    }

    String[] answer = new String[length];
    String[] split_arr = my_str.split("");

    int diff = my_str.length(); // diff는 아직 잘라내지 않은 문자열의 길이를 나타내는데 사용

    while (true) {
      if (diff < n)
        break;
      diff -= n;
      count++;
    }
    for (int i = 0; i < length; i++) {
      String save = "";
      // i가 count와 같을 때는 마지막 부분 문자열을 따로 처리합니다
      // 이 때는 for 반복문을 사용하지 않고, n * count부터 my_str.length()까지의 인덱스를 사용하여
      // 잘라진 부분 문자열을 save 변수에 저장하고, answer[i]에 할당합니다.
      if (i == count) {
        for (int k = n * count; k < my_str.length(); k++) {
          save += split_arr[k];
        }
        // 그 외의 경우에는 for 반복문을 사용하여 i에 해당하는 범위의 인덱스를 사용하여
        // 잘라낸 부분 문자열을 save 변수에 저장하고, answer[i]에 할당합니다.
        answer[i] = save;
        break;
      }
      // split_arr에서 i번째 잘라진 부분 문자열의 시작 인덱스부터 길이 n만큼의 인덱스를 차례대로 접근하게 됩니다
      for (int j = i * n; j < i * n + n; j++) {
        save += split_arr[j];
      }
      answer[i] = save;
    }

    return answer;
  }
}