
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] X = new int[N];

		for (int i = 0; i < N; i++) {
			X[i] = Integer.parseInt(input[i]);
		}
		// 배열을 복사하여 정렬하여 중복된 값을 제거하고, 각 값에 대해 압축된 결과를 구함
		int[] sortedX = X.clone();
		Arrays.sort(sortedX);

		// 이 HashMap은 특정 숫자와 그에 해당하는 압축된 결과를 저장하는 역할을 합니다.
		Map<Integer, Integer> compressionMap = new HashMap<>();
		int idx = 0;

		// HashMap의 Key는 중복이 허용되지 않기 때문에,
		// 정렬된 배열 sortedX를 순회하면서 각 값에 대해 HashMap에 없는 경우에만 압축된 결과를 저장합니다.
		for (int i = 0; i < N; i++) {
			if (!compressionMap.containsKey(sortedX[i])) {
				compressionMap.put(sortedX[i], idx++);
			}
		}
		// 압축된 결과를 출력
		StringBuilder sb = new StringBuilder();
		// 압축 결과를 모두 구한 후, 원래 입력 배열 X를 순회하면서 각 값에 해당하는 압축된 결과를 HashMap에서 찾아 출력합니다.
		// 이를 통해 주어진 배열 X를 좌표 압축한 결과를 출력하게 됩니다.
		for (int i = 0; i < N; i++) {
			sb.append(compressionMap.get(X[i])).append(" ");
		}
		System.out.println(sb.toString());
	}
}