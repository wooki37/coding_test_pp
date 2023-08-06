import java.util.HashSet;
import java.util.LinkedHashSet;

class Solution {
    public int[] solution(int[] arr, int k) {
        HashSet<Integer> set = new LinkedHashSet<>();
        
        for (int num : arr) {
            set.add(num);
        }
        int[] answer = new int[k];
        int i = 0;
        for (int num : set) {
            if (i < k) {
                answer[i++] = num;
            } else {
                break;
            }
        }
        while (i < k) {
            answer[i++] = -1;
        }
        
        return answer;
    }
}