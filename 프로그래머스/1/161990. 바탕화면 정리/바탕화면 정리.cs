using System;

public class Solution {
    public int[] solution(string[] wallpaper) {
        int lux = int.MaxValue;  // 최소 행 초기화 (파일이 있을 수 있는 최소 행)
        int luy = int.MaxValue;  // 최소 열 초기화 (파일이 있을 수 있는 최소 열)
        int rdx = int.MinValue;  // 최대 행 초기화 (파일이 있을 수 있는 최대 행)
        int rdy = int.MinValue;  // 최대 열 초기화 (파일이 있을 수 있는 최대 열)

        // wallpaper 배열을 순차적으로 탐색하여 파일이 있는 위치 추적
        for (int i = 0; i < wallpaper.Length; i++) {
            for (int j = 0; j < wallpaper[i].Length; j++) {
                if (wallpaper[i][j] == '#') {  // 파일이 있는 칸 발견
                    lux = Math.Min(lux, i);  // 최소 행 갱신
                    luy = Math.Min(luy, j);  // 최소 열 갱신
                    rdx = Math.Max(rdx, i);  // 최대 행 갱신
                    rdy = Math.Max(rdy, j);  // 최대 열 갱신
                }
            }
        }

        // 드래그 범위가 구해졌으면 그 범위에 해당하는 좌표 반환
        return new int[] { lux, luy, rdx + 1, rdy + 1 };  // rdx, rdy는 최댓값을 포함하므로 +1 해줘야 끝 지점 포함
    }
}

