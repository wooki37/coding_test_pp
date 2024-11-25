using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public int solution(string[] friends, string[] gifts)
    {
        int answer = 0;

        var friendIndex = new Dictionary<string, int>();
        for (int i = 0; i < friends.Length; i++)
        {
            friendIndex[friends[i]] = i;
        }

        // 선물을 주고받은 횟수
        int[,] giftsGiveAndTake = new int[friends.Length, friends.Length];

        // 선물 지수(선물 준 수 - 선물 받은 수)
        int[] giftIndex = new int[friends.Length];

        // 선물 주고받은 이력 처리
        foreach(var gift in gifts)
        {
            var split = gift.Split();
            int givenIndex = friendIndex[split[0]];
            int receivedIndex = friendIndex[split[1]];

            giftIndex[givenIndex]++;
            giftIndex[receivedIndex]--;

            giftsGiveAndTake[givenIndex, receivedIndex]++;
        }

        for(int i = 0; i < friends.Length; i++)
        {
            int nextMonthGift = 0;

            for (int j = 0; j < friends.Length; j++)
            {
                // 자신한테는 선물 주지 않음
                if (i == j)
                {
                    continue;
                }
                // 상대방보다 선물을 더 많이 줬을 경우
                if (giftsGiveAndTake[i, j] > giftsGiveAndTake[j, i])
                {
                    nextMonthGift++;
                }
                // 주고받은 선물 수가 같고, 선물지수가 더 큰 사람이 선물을 받는 경우
                else if (giftsGiveAndTake[i,j] == giftsGiveAndTake[j,i] && giftIndex[i] > giftIndex[j])
                {
                    nextMonthGift++;
                }
            }
            // 가장 많은 선물을 받을 친구의 선물 수 업데이트
            answer = Math.Max(answer, nextMonthGift);
        }

        return answer;
    }
}