// 11725 트리의 부모 찾기 - BFS

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  static ArrayList<ArrayList<Integer>> tree;
  static int[] parent;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    tree = new ArrayList<>();
    for (int i = 0; i <= N; i++) {
      tree.add(new ArrayList<>());
    }
    parent = new int[N + 1];

    for (int i = 0; i < N - 1; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int u = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());
      tree.get(u).add(v);
      tree.get(v).add(u);
    }
    bfs();

    for (int i = 2; i <= N; i++) {
      System.out.println(parent[i]);
    }
  }
    static void bfs() {
      Queue<Integer> queue = new LinkedList<>();
      boolean[] visited = new boolean[parent.length];

      queue.add(1);
      visited[1] = true;

      while (!queue.isEmpty()) {
        int node = queue.poll();
        for (int child : tree.get(node)) {
          if (!visited[child]) {
            parent[child] = node;
            queue.add(child);
            visited[child] = true;
          }
        }
      }
    }
}
