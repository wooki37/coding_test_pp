import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] numArr = new long[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            numArr[i] = numArr[i - 1] + Long.parseLong(st.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            numArr[i] %= M;
        }

        Arrays.sort(numArr);

        HashMap<Long, Integer> countMap = new HashMap<>();
        for (int i = 0; i <= N; i++) {
            long remainder = numArr[i] % M;
            countMap.put(remainder, countMap.getOrDefault(remainder, 0) + 1);
        }

        long sum = 0;
        for (int count : countMap.values()) {
            if (count >= 2) {
                sum += (long) count * (count - 1) / 2;
            }
        }
        System.out.println(sum);
    }
}