import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> unFinishedTasks = new ArrayList<>();
        
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                unFinishedTasks.add(todo_list[i]);
            }
        }
        return unFinishedTasks.toArray(new String[0]);
    }
}