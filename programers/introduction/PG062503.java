
// 코딩테스트 연습/코딩테스트 입문/삼각형의 완성조건(2)
class Solution {
  public int solution(int[] sides) {
    // bigValue 변수는 입력된 세 변 중 큰 값을 저장합니다. sides[0]과 sides[1] 중 더 큰 값을 선택하여 초기화합니다.
    int bigValue = Math.max(sides[0], sides[1]);
    // smallValue 변수는 입력된 세 변 중 작은 값을 저장합니다. sides[0]과 sides[1] 중 더 작은 값을 선택하여
    // 초기화합니다.
    int smallValue = Math.min(sides[0], sides[1]);

    // lowLimit 변수는 작은 값과 큰 값을 뺀 값입니다. 이는 만들 수 있는 가장 짧은 변의 길이입니다.
    int lowLimit = bigValue - smallValue;
    // highLimit 변수는 작은 값과 큰 값을 더한 값입니다. 이는 만들 수 있는 가장 긴 변의 길이입니다.
    int highLimit = bigValue + smallValue;

    // highLimit - lowLimit은 만들 수 있는 변의 길이 범위를 의미하고,
    // -1을 수행하여 중복된 변의 길이를 제외합니다. 이렇게 계산된 값이 만들 수 있는 삼각형의 개수입니다.
    return highLimit - lowLimit - 1;
  }
}