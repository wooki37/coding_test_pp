class Solution {
    public String solution(String s, int n) {
        char[] charArray = s.toCharArray();
        
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            
            if (c >= 'a' && c <= 'z') {
                // 소문자 알파벳 처리
                charArray[i] = (char) ('a' + (c - 'a' + n) % 26);
            } else if (c >= 'A' && c <= 'Z') {
                // 대문자 알파벳 처리
                charArray[i] = (char) ('A' + (c - 'A' + n) % 26);
            }
            // 공백 문자는 그대로 유지
        }
        
        return new String(charArray);
    }
}