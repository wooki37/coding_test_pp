import java.util.ArrayList;
import java.util.List;

class Solution {
    public List solution(int n, int k) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 1; k * i <= n; i++) {
            answer.add(k * i);
        }
        return answer;
    }
}