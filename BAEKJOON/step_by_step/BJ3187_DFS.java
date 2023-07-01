// 3187 양치기 꿍 - DFS

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  // 첫 번째 줄에서는 양과 늑대가 있는 맵의 크기인 r과 c를 입력받습니다.
  static int r, c, wolves, sheeps, wolf, sheep;
  static int[] Y = { -1, 1, 0, 0 }, X = { 0, 0, -1, 1 };
  // map의 상태를 2차원 배열 map에 저장합니다.
  static char[][] map = new char[251][251];
  static boolean[][] visit = new boolean[251][251];

  static void DFS(int y, int x) {

    // r개의 줄에 걸쳐 맵의 상태가 주어집니다. 각 줄에는 c개의 문자가 주어지며, '#'은 울타리, 'k'는 양, 'v'는 늑대를 나타냅니다.
    // DFS 함수에서는 현재 위치 (y, x)를 방문했음을 표시하기 위해 visit 배열의 해당 위치를 true로 설정합니다.
    visit[y][x] = true;
    // 현재 위치의 문자가 'k'인 경우 양의 수를 증가시키고, 'v'인 경우 늑대의 수를 증가시킵니다.
    if (map[y][x] == 'k')
      sheep++;
    else if (map[y][x] == 'v')
      wolf++;

      // 현재 위치에서 상하좌우를 탐색하여 이동할 수 있는 위치를 찾고,
      // 해당 위치가 범위 내에 있고 방문하지 않았으며 울타리가 아닌 경우에만 DFS 함수를 재귀적으로 호출합니다.
    for (int a = 0; a < 4; a++) {
      int ny = y + Y[a];
      int nx = x + X[a];

      // 만약 해당 위치가 울타리가 아니고(!visit[i][j]) 방문하지 않았다면,
      // DFS 함수를 호출하여 해당 위치에서의 양과 늑대의 수를 구합니다
      if (ny < 1 || nx < 1 || ny > r || nx > c || visit[ny][nx] || map[ny][nx] == '#')
        continue;

      DFS(ny, nx);
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    r = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());

    for (int i = 1; i <= r; i++) {
      char[] str = br.readLine().toCharArray();
      for (int j = 1; j <= c; j++) {
        map[i][j] = str[j - 1];

        if (map[i][j] == 'k')
          sheeps++;
        else if (map[i][j] == 'v')
          wolves++;
      }
    }

    for (int i = 1; i <= r; i++)
      for (int j = 1; j <= c; j++)
        if (map[i][j] != '#' && !visit[i][j]) {
          wolf = 0;
          sheep = 0;
          DFS(i, j);

          if (wolf >= sheep)
            sheeps -= sheep;
          else
            wolves -= wolf;
        }
    System.out.print(sheeps + " " + wolves);
  }
}