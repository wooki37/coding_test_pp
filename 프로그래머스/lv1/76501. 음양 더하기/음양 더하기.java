class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) { // true인 경우 양수
                answer += absolutes[i];
            } else {    // false인 경우 음수
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}