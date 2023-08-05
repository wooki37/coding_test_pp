import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String myStr) {
        List<String> result = new ArrayList<>();
        int start = 0;
        int i = 0;
        
        while (i < myStr.length()) {
            char ch = myStr.charAt(i);
            if (ch == 'a' || ch == 'b' || ch == 'c') {
                if (i > start) {
                    String subStr = myStr.substring(start, i);
                    result.add(subStr);
                }
                start = i + 1;
            }
            i++;
        }
        if (i > start) {
            String subStr = myStr.substring(start, i);
            result.add(subStr);
        }
        if (result.isEmpty()) {
            result.add("EMPTY");
        }
        return result.toArray(new String[0]);
    }
}