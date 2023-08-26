import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n; // 도시의 수
    static int[][] graph; // 비용 행렬
    static boolean[] visited; // 방문한 도시 체크 배열
    static int minCost = Integer.MAX_VALUE; // 최소 비용

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        visited = new boolean[n];

        // 비용 행렬 입력 받기
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 첫 번째 도시부터 시작하여 완전탐색 및 백트래킹
        for (int start = 0; start < n; start++) {
            visited[start] = true; // 시작 도시 방문 처리
            dfs(start, start, 0, 0); // 시작 도시에서 시작하여 탐색
            visited[start] = false; // 탐색 종료 후 방문 처리 해제
        }

        System.out.println(minCost); // 최소 비용 출력
    }

    // 백트래킹을 사용한 완전탐색 함수
    static void dfs(int start, int current, int count, int cost) {
        // 모든 도시를 방문한 경우
        if (count == n - 1) {
            if (graph[current][start] > 0) {
                minCost = Math.min(minCost, cost + graph[current][start]);
            }
            return;
        }

        for (int next = 0; next < n; next++) {
            if (!visited[next] && graph[current][next] > 0) {
                visited[next] = true;
                dfs(start, next, count + 1, cost + graph[current][next]);
                visited[next] = false;
            }
        }
    }
}
