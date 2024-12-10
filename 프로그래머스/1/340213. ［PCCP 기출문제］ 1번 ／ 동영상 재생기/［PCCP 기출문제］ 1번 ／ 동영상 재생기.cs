using System;

public class Solution {
        // 시간을 초 단위로 변환하는 함수
    private int TimeToSeconds(string time)
    {
        var parts = time.Split(':');
        return int.Parse(parts[0]) * 60 + int.Parse(parts[1]);
    }

    // 초 단위를 "mm:ss" 형식으로 변환하는 함수
    private string SecondsToTime(int seconds)
    {
        int minutes = seconds / 60;
        int secs = seconds % 60;
        return $"{minutes:D2}:{secs:D2}";
    }
    
    public string solution(string video_len, string pos, string op_start, string op_end, string[] commands) {
        // 입력 시간들을 초 단위로 변환
        int videoLength = TimeToSeconds(video_len);
        int currentPosition = TimeToSeconds(pos);
        int openingStart = TimeToSeconds(op_start);
        int openingEnd = TimeToSeconds(op_end);

        foreach (var command in commands)
        {
            if (currentPosition >= openingStart && currentPosition <= openingEnd)
            {
                // 현재 위치가 오프닝 구간이라면 오프닝 끝으로 이동
                currentPosition = openingEnd;
            }

            if (command == "prev")
            {
                // 10초 전으로 이동
                currentPosition = Math.Max(0, currentPosition - 10);
            }
            else if (command == "next")
            {
                // 10초 후로 이동
                currentPosition = Math.Min(videoLength, currentPosition + 10);
            }

            if (currentPosition >= openingStart && currentPosition <= openingEnd)
            {
                // 이동 후 다시 오프닝 구간에 들어왔는지 확인
                currentPosition = openingEnd;
            }
        }

        return SecondsToTime(currentPosition);
    }
}