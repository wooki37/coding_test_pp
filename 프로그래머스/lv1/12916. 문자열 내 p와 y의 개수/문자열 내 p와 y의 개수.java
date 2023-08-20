class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();    // 문자열을 모두 소문자로 변환
        int pCount = 0, yCount = 0;
        
        for (char c : s.toCharArray()) {
            if (c == 'p') pCount++; // 'p'의 개수 세기
            if (c == 'y') yCount++; // 'y'의 개수 세기
        }

        return pCount == yCount;    //'p'와 'y'의 개수가 같은지 비교
    }
}