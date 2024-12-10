using System.Linq;

public class Solution {
    public string solution(string s) {
            var nums = s.Split(' ').Select(int.Parse);

            int min = nums.Min();
            int max = nums.Max();

            return $"{min} {max}";
    }
}