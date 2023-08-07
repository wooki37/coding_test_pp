import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static int solution(int[] rank, boolean[] attendance) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = rank.length;
        // 참석 가능한 학생들의 인덱스를 저장하는 리스트
        ArrayList<Integer> availableStudents = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            map.put(rank[i], i);
        }
        for (int i = 0; i < n; i++) {
            if (attendance[i]) {
                availableStudents.add(rank[i]);
            }
        }

        // 참석 가능한 학생들 중 등수가 높은 순서대로 정렬
        Collections.sort(availableStudents);

        // 등수가 높은 3명의 학생 번호를 추출하여 결과 값 계산
        int a = map.getOrDefault(availableStudents.get(0), 0);
        int b = map.getOrDefault(availableStudents.get(1), 0);
        int c = map.getOrDefault(availableStudents.get(2), 0);

        return 10000 * a + 100 * b + c;
    }
}