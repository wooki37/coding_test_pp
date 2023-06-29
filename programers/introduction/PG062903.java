
// 코딩테스트 연습/코딩테스트 입문/홀짝 구분하기
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n % 2 == 0) {
      System.out.print(n + " is even");
      System.out.println();
    } else {
      System.out.print(n + " is odd");
      System.out.println();
    }
  }
}