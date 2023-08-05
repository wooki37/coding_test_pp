import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] splitArr = myString.split("x");
        ArrayList<String> resList = new ArrayList<>();
        
        for (String str : splitArr) {
            if (!str.isEmpty()) {
            resList.add(str);
        }
    }
    String[] resArr = resList.toArray(new String[resList.size()]);
        Arrays.sort(resArr);
        
        return resArr;
    }
}