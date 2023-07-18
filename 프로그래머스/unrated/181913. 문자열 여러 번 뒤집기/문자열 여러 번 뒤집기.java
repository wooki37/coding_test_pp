import java.lang.StringBuffer;

class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuffer sb = new StringBuffer(my_string);
        
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            for (int j = start; j <= (start + end) / 2; j++) {
                char temp = sb.charAt(j);
                sb.setCharAt(j, sb.charAt(start + end - j));
                sb.setCharAt(start + end - j, temp);
            }
        }
        return sb.toString();
    }
}
