
// 코딩테스트 연습/코딩테스트 입문/영어가 싫어요
class Solution {
  public long solution(String numbers) {
    long answer = 0;
    String[] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    for (int i = 0; i < arr.length; i++) {
      // numbers 문자열에서 arr[i]에 해당하는 영어 단어를 i로 변환합니다.
      // replaceAll 메소드를 사용하여 모든 해당하는 문자열을 찾아 변환합니다.
      // numbers 문자열 내에서 arr[i]에 해당하는 영어 단어를 i로 변환하는 작업을 수행합니다.
      // 예를 들어, arr[i]가 "zero"이고 i가 0인 경우에는 numbers 문자열 내에서 "zero"를 모두 찾아 0으로 대체합니다
      numbers = numbers.replaceAll(arr[i], String.valueOf(i));
    }
    return Long.parseLong(numbers);
  }
}