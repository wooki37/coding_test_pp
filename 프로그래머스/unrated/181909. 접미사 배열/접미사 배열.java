import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public String[] solution(String my_string) {
        // 먼저 빈 리스트인 suffixes를 생성합니다. 이 리스트에 모든 접미사를 저장할 것입니다.
        List<String> suffixes = new ArrayList<>();
        // 주어진 문자열 my_string의 길이를 n이라고 합시다.
        int n = my_string.length();
        
        for (int i = 0; i < n; i++) {
            String suffix = my_string.substring(i, n);
            suffixes.add(suffix);
        }
        // suffixes 리스트를 사전순으로 정렬합니다.
        Collections.sort(suffixes);
        // 정렬된 suffixes 리스트를 배열로 변환하여 반환합니다.
        // toArray 메서드를 사용하는데, 여기서 new String[0]은 반환되는 배열의 타입을 명시합니다.         // suffixes 리스트의 크기에 맞춰 자동으로 배열의 크기가 조정되며, 정렬된 접미사들이 배열로 반환됩니다.
        return suffixes.toArray(new String[0]);
    }
}