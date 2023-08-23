class Solution {
    public String solution(String[] seoul) {
        int x = -1;
        
         // "Kim"의 위치를 찾기 위해 배열을 순회
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                x = i;
                break;  // "Kim"을 찾았으면 더 이상 순회할 필요 없음
            }
        }
        // 결과 문자열 생성
        String answer = "김서방은 " + x + "에 있다";
        return answer;

    }
}