class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int count = 0;
        
        for (String question : quiz) {
            String[] arr = question.split(" ");
            int X = Integer.parseInt(arr[0]);
            int Y = Integer.parseInt(arr[2]);
            int Z = Integer.parseInt(arr[4]);
            int ans = 0;
            
            switch(arr[1]) {
                case "+": {
                    ans = X + Y;
                    if (ans == Z) {
                        answer[count++] = "O";
                    } else answer[count++] = "X";
                    break;
                }
                case "-" : {
                    ans = X - Y;
                    if (ans == Z) {
                        answer[count++] = "O";
                    } else answer[count++] = "X";
                    break;
                }
            }
        }
        
        return answer;
    }
}