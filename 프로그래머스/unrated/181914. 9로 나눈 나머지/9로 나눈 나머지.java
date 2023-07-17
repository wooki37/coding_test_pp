class Solution {
    public int solution(String number) {
        int answer = 0;
        // 각 자리수의 합을 구하는거
        
        for (int i = 0; i < number.length(); i++) {
            String str = String.valueOf(number.charAt(i));
            answer += Integer.parseInt(str);
        }
        answer = answer % 9;
        
       return answer;
    }
}