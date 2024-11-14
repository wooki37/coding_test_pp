using System;
using System.Collections.Generic;

public class Solution {
        public string solution(string[] survey, int[] choices)
        {
            // 성격 유형 점수 저장 및 초기화
            Dictionary<char, int> scores = new Dictionary<char, int>
            {
                {'R', 0 }, {'T', 0}, {'C', 0 }, {'F', 0 }, {'J', 0 }, {'M', 0 }, {'A', 0 }, {'N', 0 }
            };

            // 설문 조사 결과에 따른 점수 계산
            for (int i = 0; i < survey.Length; i++)
            {
                char disagreeType = survey[i][0];
                char agreeType = survey[i][1];
                int choice = choices[i];

                if (choice < 4)
                {
                    scores[disagreeType] += 4 - choice;
                } 
                else if (choice > 4)
                {
                    scores[agreeType] += choice - 4;
                }
            }

            // 각 지표에서 더 높은 점수의 성격 유형을 선택
            string answer = "";
            answer += scores['R'] >= scores['T'] ? 'R' : 'T';
            answer += scores['C'] >= scores['F'] ? 'C' : 'F';
            answer += scores['J'] >= scores['M'] ? 'J' : 'M';
            answer += scores['A'] >= scores['N'] ? 'A' : 'N';

            return answer;
        }
}