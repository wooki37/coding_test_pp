import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> resultList = new ArrayList<>();
        
        // divisor로 나누어 떨어지는 값을 리스트에 추가
        for (int num : arr) {
            if (num % divisor == 0) {
                resultList.add(num);
            }
        }
        // 나누어 떨어지는 값이 없으면 -1을 배열에 담아 반환
        if (resultList.isEmpty()) {
            return new int[] {-1};
        }
        // 리스트를 오름차순으로 정렬
        Collections.sort(resultList);
        
        // 결과 배열 생성 및 값 복사
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        return answer;
    }
}