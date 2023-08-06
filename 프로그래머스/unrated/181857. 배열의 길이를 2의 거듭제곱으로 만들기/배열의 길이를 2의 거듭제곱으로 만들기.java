import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        
        int exp = (int) Math.ceil(Math.log(n) / Math.log(2));
        
        int[] answer = Arrays.copyOf(arr, (int)Math.pow(2, exp));
        
        return answer;
    }
}