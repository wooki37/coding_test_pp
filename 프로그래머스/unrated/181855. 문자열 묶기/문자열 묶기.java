import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer,Integer> groupSizeCount = new HashMap<>();
        
        for (String str : strArr) {
            int len = str.length();
            groupSizeCount.put(len, groupSizeCount.getOrDefault(len, 0) + 1);
        }
        int maxGroupSize = 0;
        for (int groupSize : groupSizeCount.values()) {
            maxGroupSize = Math.max(maxGroupSize, groupSize);
        }
        
        return maxGroupSize;
    }
}