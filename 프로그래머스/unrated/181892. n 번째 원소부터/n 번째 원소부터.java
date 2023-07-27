import java.util.List;
import java.util.ArrayList;

class Solution {
    public List solution(int[] numList, int n) {
        List<Integer> arr = new ArrayList<>();
        
        for (int i = n - 1; i < numList.length; i++) {
            arr.add(numList[i]);
        }
        return arr;
    }
}