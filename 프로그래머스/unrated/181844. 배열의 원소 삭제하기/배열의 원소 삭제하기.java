import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
        }
        for (int del_num : delete_list) {
            arrList.remove(Integer.valueOf(del_num));
        }
        int[] answer = new int[arrList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}