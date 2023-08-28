import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        
        StringBuilder result = new StringBuilder();
        for (char c : charArray) {
            result.append(c);
        }
        return result.reverse().toString();
    }
}