class Solution {
    public String solution(String my_string, String alp) {
        char targetChar = alp.charAt(0);
        StringBuilder sb = new StringBuilder();
        
        for (char ch : my_string.toCharArray()) {
            if (ch == targetChar) {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}