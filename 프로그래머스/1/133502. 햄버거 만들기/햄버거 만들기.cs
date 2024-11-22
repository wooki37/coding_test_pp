using System;
using System.Collections.Generic;

public class Solution {
    // 시간 복잡도 분석
    // 재료 순회: ingredient의 크기를 n이라 하면, 리스트에 재료를 추가하는 연산은 O(n).
    // 햄버거 패턴 확인 및 삭제:
    // 리스트에서 마지막 4개를 확인하고 삭제하는 연산은 O(1).
    // 최대 n번 실행되므로, O(n).
    // 결론적으로, 시간 복잡도: O(n).

    // 공간 복잡도 분석
    // ingredientList는 최대 n개의 요소를 저장.
    // 공간 복잡도: O(n).
    public int solution(int[] ingredient)
    {
        List<int> ingredientList = new List<int>();
        int bugerCount = 0;

        foreach(int item in ingredient)
        {
            ingredientList.Add(item);

            if (ingredientList.Count >= 4 &&
                ingredientList[ingredientList.Count - 4] == 1 &&
                ingredientList[ingredientList.Count - 3] == 2 &&
                ingredientList[ingredientList.Count - 2] == 3 &&
                ingredientList[ingredientList.Count - 1] == 1)
            {
                // 리스트 마지막 4개의 재료를 제거(포장)
                ingredientList.RemoveRange(ingredientList.Count - 4, 4);
                bugerCount++;
            }
        }
        return bugerCount;
    }
}