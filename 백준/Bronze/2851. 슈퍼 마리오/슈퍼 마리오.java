// 2851 - 슈퍼 마리오

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0; // 마리오가 받는 점수의 합을 저장하는 변수
		int target = 100; // 목표 점수인 100
		int[] mushRooms = new int[11]; // 버섯의 점수를 저장하는 배열

		for (int i = 1; i <= 10; i++) {
			mushRooms[i] = mushRooms[i - 1] + Integer.parseInt(br.readLine());
			if (target >= Math.abs(mushRooms[i] - 100)) {
				target = Math.abs(mushRooms[i] - 100);
				sum = mushRooms[i];
			}
		}
		System.out.println(sum);
	}
}
