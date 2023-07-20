class Solution {
    public int solution(String my_string, String is_suffix) {
        int len = my_string.length();
        int suffixLen = is_suffix.length();
        
        // is_suffix의 길이가 my_string보다 길면, 접미사가 될 수 없으므로 0 반환
        if (len < suffixLen) {
            return 0;
        }
        // my_string에서 is_suffix의 길이만큼 뒤에서부터 자른 문자열을 구합니다.
        String suffix = my_string.substring(len - suffixLen, len);
        // 구한 suffix와 is_suffix가 동일하면, is_suffix가 my_string의 접미사입니다.
        if (suffix.equals(is_suffix)) {
            return 1;
        //suffix와 is_suffix가 다르면, is_suffix가 my_string의 접미사가 아닙니다.
        } else {
            return 0;
        }
    }
}

// 문제 접근 :
//문자열 is_suffix가 my_string의 접미사인지 판별하는 방법은 간단합니다.
// my_string의 끝에서부터 is_suffix의 길이만큼을 잘라낸 문자열과 is_suffix가 동일하면
// is_suffix가 my_string의 접미사입니다. 아래와 같이 구현할 수 있습니다.