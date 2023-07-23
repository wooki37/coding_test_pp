// 1931 - 회의실 배정

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[][] meetings = new int[N][2];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			meetings[i][0] = Integer.parseInt(st.nextToken());
			meetings[i][1] = Integer.parseInt(st.nextToken());
		}
		// 회의 끝나는 시간을 기준으로 오름차순 정렬
		// 끝나는 시간이 같다면 시작 시간을 기준으로 오름차순 정렬
		Arrays.sort(meetings, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});
		int maxCount = 1;
		int endTime = meetings[0][1];

		for (int i = 1; i < N; i++) {
			if (meetings[i][0] >= endTime) {
				maxCount++;
				endTime = meetings[i][1];
			}
		}
		System.out.println(maxCount);

	}
}
