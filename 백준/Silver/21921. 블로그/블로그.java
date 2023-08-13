import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] visitors = new int[N];
        for (int i = 0; i < N; i++) {
            visitors[i] = Integer.parseInt(st.nextToken());
        }

        int maxSum = 0;
        int maxCount = 0;
        int currentSum = 0;

        for (int i = 0; i < X; i++) {
            currentSum += visitors[i];
        }

        for (int i = 0; i <= N - X; i++) {
            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxCount = 1;
            } else if (currentSum == maxSum) {
                maxCount++;
            }

            currentSum -= visitors[i];
            if (i + X < N) {
                currentSum += visitors[i + X];
            }
        }

        if (maxSum == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(maxSum);
            System.out.println(maxCount);
        }
    }
}
