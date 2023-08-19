import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] sequence;
    static boolean[] used;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        sequence = new int[M];
        used = new boolean[N + 1];

        generateSequence(0);

        br.close();
    }

    static void generateSequence(int index) {
        if (index == M) {
            for (int num : sequence) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!used[i]) {
                sequence[index] = i;
                used[i] = true;
                generateSequence(index + 1);
                used[i] = false;
            }
        }
    }
}
