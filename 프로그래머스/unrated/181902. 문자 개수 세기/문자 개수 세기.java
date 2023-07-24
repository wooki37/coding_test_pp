import java.util.Arrays;

public class Solution {
    public int[] solution(String my_string) {
        int[] result = new int[52];

        for (char ch : my_string.toCharArray()) {
            if ('A' <= ch && ch <= 'Z') { // 대문자인 경우
                result[ch - 'A']++;
            } else if ('a' <= ch && ch <= 'z') { // 소문자인 경우
                result[ch - 'a' + 26]++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String my_string = "Programmers";
        int[] result = solution.solution(my_string);
        System.out.println(Arrays.toString(result));
    }
}