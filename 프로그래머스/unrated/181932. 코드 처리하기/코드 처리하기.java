class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for (int idx = 0; idx < code.length(); idx++) {
            char c = code.charAt(idx);
            
            if (mode == 0) {
                if (c != '1' && idx % 2 == 0) {
                    ret += c; 
                } else if (c == '1') {
                    mode = 1;
                }
            } else if (mode == 1) {
                if (c != '1' && idx % 2 != 0) {
                    ret += c;
                } else if (c == '1') {
                    mode = 0;
                }
            }
        }
        if (ret.equals("")) {
            ret = "EMPTY";
        }
        return ret;
    }
}