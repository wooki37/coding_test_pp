import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        String[] words = my_string.split("\\s+");
        List<String> list = new ArrayList<>();
        
        for (String word : words) {
            if (!word.isEmpty()) {
                list.add(word);
            }
        }
        
        return list.toArray(new String[0]);
    }
}