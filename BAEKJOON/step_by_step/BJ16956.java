
// 16956 늑대와 양 - BFS()
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  static int r, c;
  static char[][] map;
  static Queue<int[]> q = new LinkedList<>();
  static int[] dx = { -1, 1, 0, 0 };
  static int[] dy = { 0, 0, -1, 1 };
  static boolean flag = true;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    r = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());

    map = new char[r][c];
    for (int i = 0; i < r; i++) {
      String s = br.readLine();
      for (int j = 0; j < c; j++) {
        map[i][j] = s.charAt(j);
        if (map[i][j] == 'W') {
          q.add(new int[] { i, j });
        }
      }
    }
    bfs();

    if (flag) {
      System.out.println("1");
      for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
          System.out.print(map[i][j]);
        }
        System.out.println();
      }
    } else {
      System.out.println("0");
    }

  }

  static void bfs() {
    while (!q.isEmpty()) {
      int[] t = q.poll();
      int x = t[0];
      int y = t[1];
      for (int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];
        if (nx >= 0 && nx < r && ny >= 0 && ny < c) {
          if (map[nx][ny] == '.') {
            map[nx][ny] = 'D';
          }
          if (map[nx][ny] == 'S') {
            flag = false;
            return;
          }
        }
      }
    }
  }
}

// BFS 와 DFS
// BFS와 DFS는 그래프 탐색 알고리즘 중 가장 기본적인 두 가지 방법입니다.
// 이들은 주어진 그래프에서 노드를 탐색하고 연결된 모든 노드를 방문하는 데 사용됩니다.

// BFS (너비 우선 탐색):
// BFS는 그래프 탐색을 수평적으로 진행하는 알고리즘입니다. 즉, 같은 레벨에 있는 모든 노드를 먼저 탐색한 후에 다음 레벨로 넘어갑니다.
// BFS는 큐(Queue) 자료구조를 사용하여 구현됩니다.
// 시작 노드를 큐에 넣고, 큐에서 노드를 하나씩 꺼내면서 그와 연결된 노드를 큐에 추가합니다.
// BFS는 가까운 노드부터 순차적으로 탐색하기 때문에 최단 경로를 찾는 문제에 자주 활용됩니다.

// DFS (깊이 우선 탐색):
// DFS는 그래프 탐색을 깊이 방향으로 진행하는 알고리즘입니다. 즉, 한 경로를 따라 끝까지 탐색한 후에 다음 경로로 넘어갑니다.
// DFS는 스택(Stack) 자료구조를 사용하여 구현됩니다. 시작 노드를 스택에 넣고,
// 스택에서 노드를 하나씩 꺼내면서 그와 연결된 노드를 스택에 추가합니다.
// DFS는 모든 분기를 탐색하고자 할 때 유용하며, 그래프 내에 특정한 경로가 존재하는지 여부를 확인하는 문제에 자주 활용됩니다.
// 요약하면, BFS는 너비 우선으로 그래프를 탐색하며 가까운 노드부터 차례로 방문하고,
// DFS는 깊이 우선으로 그래프를 탐색하며 한 경로를 끝까지 탐색한 후 다른 경로로 넘어갑니다.
// 이러한 특성에 따라 각각의 알고리즘은 다양한 문제에 활용됩니다.
