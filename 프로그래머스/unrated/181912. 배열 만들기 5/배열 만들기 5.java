import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        // List<Integer>를 사용함으로써 코드는 필요에 따라 리스트를 동적으로 확장하거나 축소할 수 있습니다.
        // 조건을 만족하는 정수들이 발견되면 이들 값을 리스트에 추가할 수 있습니다. 만약 조건을 만족하는 정수가 없다면 리스트는 비어있게 될 것입니다.
        List<Integer> result = new ArrayList<>();

        for (String str : intStrs) {
            // 아래 코드를 통해 s번 인덱스에서 시작하여 길이 l짜리 부분 문자열을 잘라내고, 해당 부분 문자열을 정수로 변환
            int num = Integer.parseInt(str.substring(s, s + l));
            // 변환된 정수 num과 입력으로 주어진 k를 비교하여 num > k인 경우에만 해당 정수를 result 리스트에 추가합니다.
            //즉, k보다 큰 정수만 결과 리스트에 포함
            if (num > k) {
                result.add(num);
            }
        }
        return result;
    }
}
