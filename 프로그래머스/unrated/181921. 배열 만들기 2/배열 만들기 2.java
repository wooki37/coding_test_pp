import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        String[] notZeroFive = new String[]{"1", "2", "3", "4", "6", "7", "8", "9"};
        for (int i = l; i <= r; i++) {
            String str = String.valueOf(i);
            boolean b = false;
            for (int j = 0; j < notZeroFive.length; j++) {
                if (str.contains(notZeroFive[j])) {
                    b = true;
                    break;
                }
            }
            if (!b) {
                list.add(Integer.parseInt(str));
            }
        }
            return list.size() > 0 ? list.stream().mapToInt(Integer::intValue).toArray() : new int[]{-1};
        }
    }