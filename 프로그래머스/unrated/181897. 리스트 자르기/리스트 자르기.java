import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        if (n == 1) {
            for (int i = 0; i < b + 1; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 2) {
            for (int i = a; i < num_list.length; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 3) {
            for (int i = a; i < b + 1; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 4) {
            for (int i = a; i < b + 1; i+=c) {
                list.add(num_list[i]);
            }
        }
        
// list.stream(): 리스트인 list를 스트림으로 변환합니다. 스트림은 자바 8부터 추가된 기능으로, 컬렉션(Collection)과 배열 등의 데이터를 다루는 데 유용한 연산들을 제공합니다.

// mapToInt(x -> x): 스트림의 각 요소들을 int 타입으로 변환하는 매핑 연산입니다. 여기서 람다식 x -> x는 각 요소를 그대로 반환하는 익명 함수입니다. 따라서 이 매핑 연산은 스트림의 요소들을 int로 변환하지만 실제로는 변환 과정 없이 그대로 반환하는 것입니다.

// toArray(): 스트림의 요소들을 배열로 변환합니다. 이 코드에서는 int 형식으로 스트림의 요소들을 변환했으므로, 최종적으로 int[] 배열이 생성됩니다.
        // 자바의 스트림(Stream)을 이용하여 리스트(list)의 요소들을 int형 배열로 변환
        int[] answer = list.stream().mapToInt(x -> x).toArray();
        return answer;
    }
}