// 14929 귀찮아 (SIB)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n + 1];
    int[] sum = new int[n + 1];

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 1; i <= n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      sum[i] = sum[i - 1] + arr[i];
    }
    long ans = 0;
    for (int i = 1; i < n; i++) {
      int v = getSubSum(i + 1, n, sum);
      ans += v * arr[i];
    }
    System.out.println(ans);
  }

  static int getSubSum(int l, int r, int[] sum) {
    return sum[r] - sum[l - 1];
  }
}
