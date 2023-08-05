class Solution {
    public int solution(String binomial) {
        String[] splitArr = binomial.split(" ");
        
        int a = Integer.parseInt(splitArr[0]);
        int b = Integer.parseInt(splitArr[2]);
        
        if (splitArr[1].charAt(0) == '+')  {
            a += b;
        } else if (splitArr[1].charAt(0) == '-') {
            a -= b;
        } else {
            a *= b;
        }
        return a;
    }
}