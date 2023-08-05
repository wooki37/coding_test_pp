import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> intList = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    intList.add(arr[i]);
                }
            } else {
                int len = intList.size() - 1;
                for (int j = 0; j < arr[i]; j++) {
                    intList.remove(len--);
                }
            }
        }

        return intList.stream().mapToInt(x -> x).toArray();
    }
}