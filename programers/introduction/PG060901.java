// 코딩테스트 연습/코딩테스트 입문/옷 가게 할인 받기

class Solution {
  public int solution(int price) {

    if (price >= 500000) {
      price *= 0.8;
    } else if (price >= 300000) {
      price *= 0.9;
    } else if (price >= 100000) {
      price *= 0.95;
    }
    return price;
  }
}