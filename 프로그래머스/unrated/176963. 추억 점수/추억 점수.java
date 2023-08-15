import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> yearningMap = new HashMap<>();
        
        for (int i = 0; i < name.length; i++) {
            yearningMap.put(name[i], yearning[i]);
        }
        int[] answer = new int[photo.length];
        
        for (int i = 0; i < photo.length; i++) {
            int totalScore = 0;
            for (String person : photo[i]) {
                if (yearningMap.containsKey(person)) {
                    totalScore += yearningMap.get(person);
                }
            }
            answer[i] = totalScore;
        }
        return answer;
    }
}