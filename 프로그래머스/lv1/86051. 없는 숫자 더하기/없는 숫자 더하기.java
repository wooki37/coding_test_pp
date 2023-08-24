import java.util.HashSet;

class Solution {
    public int solution(int[] numbers) {
        HashSet<Integer>set = new HashSet<>();
        
        // 주어진 배열에 있는 숫자들을 HashSet에 저장
        for (int num : numbers) {
            set.add(num);
        }
        int answer = 45;    // 0부터 9까지의 숫자 합
        for (int num : set) {
            answer -= num;
        }

        return answer;
    }
}