import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : my_string.toCharArray()) {
            if (ch == ' ') {
                if (sb.length() > 0) {
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(ch);
            }
        }

        if (sb.length() > 0) {
            list.add(sb.toString());
        }

        return list.toArray(new String[0]);
    }
}
