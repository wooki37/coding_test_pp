class Solution {
    public int solution(String myString, String pat) {
        String str = "";
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.substring(i, i + 1).equals("A")) {
                str += "B";
            } else {
                str += "A";
            }
        }
        
        return str.contains(pat) ? 1 : 0;
    }
}