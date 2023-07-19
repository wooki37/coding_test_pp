// 11724 연결 요소의 개수 - DFS

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken()); // 정점의 개수
    int M = Integer.parseInt(st.nextToken()); // 간선의 개수

    // 그래프 생성 (인접 리스트)
    List<Integer>[] graph = new ArrayList[N + 1];
    for (int i = 1; i <= N; i++) {
      graph[i] = new ArrayList<>();
    }
    // 간선 정보 입력
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int u = Integer.parseInt(st.nextToken()); // M개의 줄에 간선의 양 끝점
      int v = Integer.parseInt(st.nextToken()); // M개의 줄에 간선의 양 끝점
      // 양방향 그래프이므로 양쪽 정점 모두에 간선 정보를 추가
      graph[u].add(v);
      graph[v].add(u);
    }
    // 방문 여부를 저장하는 배열
    boolean[] visited = new boolean[N + 1];
    int connectedComponents = 0;

    // 모든 정점에 대해 DFS를 수행하면서 연결 요소 개수를 셉니다.
    for (int i = 1; i <= N; i++) {
      if (!visited[i]) {
        connectedComponents++;
        dfs(graph, i, visited);
      }
    }
    System.out.println(connectedComponents);
  }

  // DFS 함수
  private static void dfs(List<Integer>[] graph, int start, boolean[] visited) {
    visited[start] = true;
    for (int next : graph[start]) {
      if (!visited[next]) {
        dfs(graph, next, visited);
      }
    }
  }
}
