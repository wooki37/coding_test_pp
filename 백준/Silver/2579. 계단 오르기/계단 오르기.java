// 2579 - 계단 오르기

import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] stairs = new int[n + 1];
		int[] dp = new int[n + 1];

		for (int i = 1; i < n + 1; i++) {
			stairs[i] = sc.nextInt();
		}
		dp[0] = 0;
		dp[1] = stairs[1];

		if (n >= 2) {
			dp[2] = stairs[1] + stairs[2];
		}
		for (int i = 3; i < n + 1; i++) {
			dp[i] = Math.max(stairs[i] + stairs[i - 1] + dp[i - 3], stairs[i] + dp[i - 2]);
		}
		System.out.println(dp[n]);

	}
}
