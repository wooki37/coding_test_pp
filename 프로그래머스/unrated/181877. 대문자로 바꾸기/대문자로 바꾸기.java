class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for (int i = 0; i < myString.length(); i++) {
            answer = myString.toUpperCase();
        }
        
        return answer;
    }
}