
// 2751 수 정렬하기 2
import java.util.Scanner;
import java.util.ArrayList; // ArrayList 메서드 활용
import java.util.Collections; // Collections 메서드 활용

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder(); // tringBuilder를 사용하여 결과를 저장하고 출력할 때 한 번에 출력

    int N = sc.nextInt();

    ArrayList<Integer> list = new ArrayList<>(); // 입력으로 받은 수를 저장하기 위해 ArrayList<Integer>를 사용
    for (int i = 0; i < N; i++) {
      list.add(sc.nextInt());
    }
    Collections.sort(list); // Collections.sort()를 사용하여 ArrayList을 오름차순으로 정렬

    for (int value : list) { // for-each 문을 사용하여 정렬된 ArrayList의 각 요소를 순회하면서 StringBuilder에 저장
      sb.append(value).append('\n');
    }
    System.out.println(sb);
  }
}

// StringBuilder: StringBuilder는 가변 문자열을 처리하기 위한 클래스입니다. 문자열 연산이 많은 경우,
// StringBuilder를 사용하여 문자열을 효율적으로 처리할 수 있습니다.
// StringBuilder는 내부적으로 가변적인 크기의 문자열 버퍼를 가지고 있으며,
// 문자열 연결, 삽입, 삭제 등의 작업을 효율적으로 처리할 수 있습니다.
// 기존 문자열에 직접적인 변경을 가하지 않고 버퍼에 작업을 수행한 후 필요한 시점에 문자열로 변환할 수 있습니다.

// ArrayList<Integer>: ArrayList는 크기를 동적으로 조절할 수 있는 배열 기반의 자료구조입니다.
// ArrayList<Integer>은 정수형 데이터를 저장하는 동적 배열을 나타냅니다. ArrayList는 배열과 달리 크기를 지정하지
// 않아도 되며,
// 요소의 추가, 삭제, 검색 등을 효율적으로 처리할 수 있습니다. 인덱스를 사용하여 요소에 접근할 수 있고, 요소의 순서를 유지합니다.

// Collections.sort(): Collections는 자바에서 제공하는 유틸리티 클래스로, 여러 유용한 메서드를 포함하고 있습니다.
// Collections.sort()는 List 인터페이스를 구현하는 컬렉션을 정렬하는 메서드입니다.
// Collections.sort()는 내부적으로 퀵소트(Quicksort) 알고리즘을 사용하여 정렬을 수행합니다.
// 정렬되는 객체는 Comparable 인터페이스를 구현해야 하며,
// Comparable 인터페이스의 compareTo() 메서드를 사용하여 객체의 순서를 비교합니다.
// Collections.sort()를 사용하면 ArrayList과 같은 리스트를 쉽게 정렬할 수 있습니다.

// 따라서, 해당 코드에서 StringBuilder는 문자열 결과를 효율적으로 처리하고 출력하기 위해 사용되고,
// ArrayList<Integer>는 입력된 수를 동적으로 저장하기 위해 사용됩니다.
// 그리고 Collections.sort()를 사용하여 ArrayList<Integer>를 오름차순으로 정렬합니다.

// 시간 초과
// import java.util.Scanner;
// import java.util.Arrays; // Arrays.sort 메서드 활용

// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int N = sc.nextInt(); // 정렬할 수의 개수 N
// long num[] = new long[N]; // 배열 크기를 N 만큼으로 설정

// for (int i = 0; i < N; i++) {
// num[i] = sc.nextInt(); // N번 동안 수를 입력받아 반복하여 num에 저장
// }
// Arrays.sort(num); // num을 오름차순으로 정렬하는 메서드
// for (int i = 0; i < N; i++) {
// System.out.println(num[i]); // 반복문을 통해 정렬된 num의 원소를 하나씩 출력
// }
// }
// }