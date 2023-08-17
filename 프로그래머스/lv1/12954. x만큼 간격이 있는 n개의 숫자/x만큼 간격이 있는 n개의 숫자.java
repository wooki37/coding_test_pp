import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Long> solution(int x, int n) {
        List<Long> answer = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            answer.add((long)x + ((long)x * i));
        }
        
        return answer;
    }
}