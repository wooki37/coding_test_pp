import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static int[] solution(int[] arr) {
        if (arr.length <= 1) {
            return new int[]{-1};
        }

        int minValue = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < minValue) {
                minValue = num;
            }
        }

        List<Integer> resultList = new ArrayList<>();
        for (int num : arr) {
            if (num != minValue) {
                resultList.add(num);
            }
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}