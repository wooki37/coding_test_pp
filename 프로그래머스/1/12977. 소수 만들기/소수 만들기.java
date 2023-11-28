class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if(isPrime(nums[i] + nums[j] + nums[k])) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    Boolean isPrime(int num) {
        int i = 2;
        boolean prime = true;
        while (i < num) {
            if (num % i == 0) {
                prime = false;
                break;
            }
            else i++;
        }
        return prime;
    }
}