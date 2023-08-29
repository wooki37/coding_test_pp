class Solution {
    public long solution(int price, int money, int count) {
        long answer = (long) price * count * (count + 1) / 2;
        if (answer <= money) {
            return 0;
        } else {
            return answer - money;
        }

    }
}