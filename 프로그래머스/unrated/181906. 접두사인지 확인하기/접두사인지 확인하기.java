class Solution {
    public int solution(String my_string, String is_prefix) {
        // is_prefix의 길이가 my_string보다 길다면 0을 반환
        if (is_prefix.length() > my_string.length()) {
            return 0;
        }
        // is_prefix의 길이만큼 my_string과 is_prefix를 비교하여 서로 같은지 확인
        for (int i = 0; i < is_prefix.length(); i++) {
            if (my_string.charAt(i) != is_prefix.charAt(i)) {
                return 0;
            }
        }
            // 모든 문자가 같다면 is_prefix는 my_string의 접두사이므로 1을 반환
    return 1;
        }
    }