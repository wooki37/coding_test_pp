using System;

public class Solution {
    public int solution(string s) {
        
        int answer = 0; // 분리된 문자열의 개수
        int same = 0;   // 같은 문자열의 개수
        int notSame = 0;    // 같지 않은 문자열의 개수
        int start = 0;  // 첫번째 기준 문자열의 개수
        
        for(int i = 0; i < s.Length; i++)
        {
            if(s[start] == s[i])
            {
                same++;
            }
            else
            {
                notSame++;
            }
            if(same == notSame)
            {
                answer += 1;
                if(i < s.Length - 1)
                {
                    start = i+1;
                }
            }
            else if( i == s.Length - 1)
            {
                answer += 1;
            }
        }
        return answer;
    }
}
