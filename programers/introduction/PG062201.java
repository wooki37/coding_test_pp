
// 코딩테스트 연습/코딩 기초 트레이닝/대소문자 바꿔서 출력하기
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next(); // aBcDeFg
    String answer = "";

    for (int i = 0; i < a.length(); i++) {
      char c = a.charAt(i);
      if (Character.isUpperCase(c)) { // Character.isUpperCase(c)를 사용하여 문자 c가 대문자인지 검사합니다.
        answer += Character.toLowerCase(c);
      } else {
        answer += Character.toUpperCase(c);
      }
    }
    System.out.println(answer);
  }
}
