import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long[][] univ;
    static long[][] ans;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        univ = new long[N][N];
        ans = new long[N][N];

        for (int i = 0; i < N; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                try {
                    long num = Long.parseLong(row[j]);
                    univ[i][j] = -1 * num;
                } catch (NumberFormatException e) {
                    System.out.println("잘못된 입력입니다.");
                    return;
                }
            }
        }

        solve();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(ans[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void solve() {
        int r = M / 2;
        int start = r;
        int end = N - r;

        for (int i = start; i < end; i++) {
            for (int j = start; j < end; j++) {
                ans[i][j] = univ[i - r][j - r];
                if (i - r - 1 >= 0)
                    ans[i][j] -= univ[i - r - 1][j - r];
                if (j - r - 1 >= 0)
                    ans[i][j] -= univ[i - r][j - r - 1];
                if (i - r - 1 >= 0 && j - r - 1 >= 0)
                    ans[i][j] += univ[i - r - 1][j - r - 1];
                if (i - M >= 0)
                    ans[i][j] += ans[i - M][j];
                if (j - M >= 0)
                    ans[i][j] += ans[i][j - M];
                if (i - M >= 0 && j - M >= 0)
                    ans[i][j] -= ans[i - M][j - M];
            }
        }
    }
}