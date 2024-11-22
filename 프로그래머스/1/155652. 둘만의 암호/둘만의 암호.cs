using System;
using System.Text;
using System.Collections.Generic;

public class Solution {
    public string solution(string s, string skip, int index)
    {

        // 1. 유효 알파벡 리스트 생성
        var validAlphabets = new List<char>();

        for (char c = 'a'; c <= 'z'; c++)
        {
            if (!skip.Contains(c))
            {
                validAlphabets.Add(c);
            }
        }

        // 2. 문자열 반환
        var result = new StringBuilder();

        foreach(char ch in s)
        {
            // 현재 문자 위치 찾기
            int currentIndex = validAlphabets.IndexOf(ch);

            // 이동 후 위치 계산 (순환 포함)
            int newIndex = (currentIndex + index) % validAlphabets.Count;

            // 변환된 문자 추가
            result.Append(validAlphabets[newIndex]);
        }

        return result.ToString();
    }
}