class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();  // 문자열을 이어붙이기 위한 StringBuilder 생성
        
        for (int i = 0; i < my_strings.length; i++) {
            int s = parts[i][0]; // 시작 인덱스
            int e = parts[i][1]; // 끝 인덱스
            
            // 시작 인덱스부터 끝 인덱스까지의 부분 문자열을 StringBuilder에 추가
            sb.append(my_strings[i].substring(s, e + 1));
        }
        return sb.toString();   // // StringBuilder를 String으로 변환하여 반환
    }
}