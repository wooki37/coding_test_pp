import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        List<Integer> reverseDigits = new ArrayList<>();
        
        while (n > 0) {
            int digit = (int) (n % 10);
            reverseDigits.add(digit);
            n /= 10;
        }
        int[] result = new int[reverseDigits.size()];
        for (int i = 0; i < reverseDigits.size(); i++) {
            result[i] = reverseDigits.get(i);
        }
        
        return result;
    }
}