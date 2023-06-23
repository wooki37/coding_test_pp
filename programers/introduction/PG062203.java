
// 코딩테스트 연습/코딩 기초 트레이닝/덧셈식 출력하기
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.printf("%d + %d = %d", a, b, (a + b));
  }
}

// ###문제를 풀며 헷갈렸던 'print'와 'printf'와 'println'의 차이

// print:
// print는 인자로 전달된 값을 출력하는 메소드입니다.
// 출력 후에 줄 바꿈을 하지 않으며, 다음 출력이 현재 출력 값의 오른쪽에 이어서 출력됩니다.
// 예시: System.out.print("Hello"); (출력: "Hello")

// printf:
// printf는 형식화된 문자열을 출력하는 메소드입니다.
// C언어의 printf와 유사한 방식으로 형식 문자열과 인자들을 사용하여 문자열을 구성하고 출력합니다.
// % 기호와 형식 지정자를 사용하여 출력 형식을 지정할 수 있습니다.
// 예시: System.out.printf("Name: %s, Age: %d", name, age); (출력: "Name: John, Age:
// 25")

// println:
// println은 인자로 전달된 값을 출력하고, 출력 후에 줄 바꿈을 수행하는 메소드입니다.
// 출력 후 다음 출력은 다음 줄에서 시작됩니다.
// 예시: System.out.println("Hello"); (출력: "Hello" + 줄 바꿈)

// 정리 :
// 따라서, print는 줄 바꿈 없이 값을 출력하고 계속해서 이어지는 형태로 출력합니다.
// printf는 형식화된 문자열과 인자를 사용하여 출력 형식을 지정하며, println은 값을 출력한 후 줄 바꿈을 수행합니다.
// 개발자의 필요에 따라 적절한 출력 메소드를 선택하여 사용할 수 있습니다.