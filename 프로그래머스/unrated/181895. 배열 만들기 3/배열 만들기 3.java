import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> result = new ArrayList<>();
        
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];
        for (int i = start1; i <= end1; i++) {
            result.add(arr[i]);
        }
        int start2 = intervals[1][0];
        int end2 = intervals[1][1];
        for (int i = start2; i <= end2; i++) {
            result.add(arr[i]);
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}