// 1012 유기농배추 - DFS

import java.util.Scanner;

public class Main {
  public static int M, N, K;
  public static int graph[][] = new int[50][50];

  public static boolean dfs(int x, int y) {
    if (x < 0 || x >= M || y < 0 || y >= N)
      return false;
    if (graph[x][y] == 1) {
      graph[x][y] = 0;
      dfs(x - 1, y); // 상
      dfs(x + 1, y); // 하
      dfs(x, y - 1); // 좌
      dfs(x, y + 1); // 우
      return true;
    }

    return false;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // 첫 번째 입력인 T는 테스트 케이스의 개수
    int T = sc.nextInt();

    for (int tc = 0; tc < T; tc++) {
      // 각 테스트 케이스마다 M과 N은 배추 지도의 가로와 세로 크기를 나타내고, K는 배추의 개수를 나타냅니다.
      M = sc.nextInt();
      N = sc.nextInt();
      K = sc.nextInt();

      // K번 반복하며 배추의 위치를 입력받아 배추 지도에 1로 표시
      for (int k = 0; k < K; k++) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        graph[x][y] = 1;
      }

      int cnt = 0;
      for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
          if (dfs(i, j))
            cnt += 1;
        }
      }

      System.out.println(cnt);

    }
  }
}