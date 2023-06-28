
// 코딩테스트 연습/코딩테스트 입문/치킨 쿠폰
class Solution {
  public int solution(int chicken) {
    int answer = 0; // 구매한 치킨의 수를 저장합니다.
    int coupon = 0; // 현재 보유한 쿠폰의 수를 저장합니다.

    while (true) {
      coupon = chicken / 10; // 현재 가지고 있는 치킨으로부터 얻을 수 있는 쿠폰의 수를 나타냅니다.
      // chicken을 10으로 나눈 나머지와 coupon을 더한 값을 할당합니다.
      // 이는 쿠폰을 사용하여 치킨을 구매하고 남은 치킨의 수를 업데이트합니다.
      chicken = chicken % 10 + coupon;
      answer += coupon; // 현재까지 구매한 치킨의 수에 쿠폰으로 얻은 치킨의 수를 더합니다.
      if (chicken < 10) { // chicken이 10보다 작은 경우, 즉 치킨을 더 이상 구매할 수 없는 경우 break문을 실행
        break;
      }
    }
    return answer; // 사용한 쿠폰으로 구매한 치킨의 총 수를 나타냅니다
  }
}