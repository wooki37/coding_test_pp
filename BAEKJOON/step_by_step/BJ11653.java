
// 11653 소인수분해
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int i = 2;

    while (true) {
      if (n == 1) {
        break;
      }
      if (n % i == 0) {
        System.out.println(i);
        n = n / i;
        continue;
      } else {
        i++;
      }
    }
  }
}