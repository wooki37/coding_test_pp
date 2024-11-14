using System;
using System.Collections.Generic;

public class Solution {
        public int[] solution(string today, string[] terms, string[] privacies)
        {
            // 오늘 날짜 파싱해서 저장
            int todayYear = int.Parse(today.Split(".")[0]);
            int todayMonth = int.Parse(today.Split(".")[1]);
            int todayDay = int.Parse(today.Split(".")[2]);

            // 오늘날짜를 총 일수로 변환
            // ex)todayTotalMonths = 24269
            int todayTotalMonths = todayYear * 12 + todayMonth;

            // 약관 유효기관을 딕셔너리에 저장
            // ex)termDict = <약관종류,유효기간>
            Dictionary<string, int> termDict = new Dictionary<string, int>();
            foreach (var term in terms)
            {
                string[] splitTerm = term.Split(' ');
                string type = splitTerm[0];
                int validityMonths = int.Parse(splitTerm[1]);
                termDict[type] = validityMonths;
            }

            // 개인정보 파기 여부 계산
            List<int> toBeDeleted = new List<int>();

            for (int i = 0; i < privacies.Length; i++)
            {
                string[] privacyParts = privacies[i].Split(' ');
                string[] dateParts = privacyParts[0].Split('.');

                int year = int.Parse(dateParts[0]);
                int month = int.Parse(dateParts[1]);
                int day = int.Parse(dateParts[2]);

                // 개인정보의 총 월 수로 계산
                // privacyParts[1] = 개인 정보 수집 약관 종류 ex)termDict[A]
                int privacyTotalMonths = year * 12 + month + termDict[privacyParts[1]];

                // 오늘 날자와 비교해서 만료 확인
                if (privacyTotalMonths < todayTotalMonths || (privacyTotalMonths == todayTotalMonths && day <= todayDay))
                {
                    toBeDeleted.Add(i + 1);
                }
            }

            return toBeDeleted.ToArray();
        }
}