using System;
using System.Collections.Generic;

public class Solution {
    public int[] solution(string[] keymap, string[] targets)
    {
        Dictionary<char, int> charToMinPress = new Dictionary<char, int>();
        for (int i = 0; i < keymap.Length; i++)
        {
            string key = keymap[i];
            for (int j = 0; j < key.Length; j++)
            {
                char c = key[j];
                int pressCount = j + 1;
                if (!charToMinPress.ContainsKey(c) || charToMinPress[c] > pressCount)
                {
                    charToMinPress[c] = pressCount;
                }
            }
        }

        List<int> results = new List<int>();
        foreach(string target in targets)
        {
            int totalPressCount = 0;
            bool isWritable = true;

            foreach(char c in target)
            {
                if (!charToMinPress.ContainsKey(c))
                {
                    isWritable = false;
                    break;
                }
                totalPressCount += charToMinPress[c];
            }
            results.Add(isWritable ? totalPressCount : -1);
        }

        return results.ToArray();
    }
}