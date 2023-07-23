import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int q = Integer.parseInt(br.readLine());

        // 각 알파벳의 누적 등장 횟수를 저장하는 배열
        int[][] cumulativeCount = new int[26][S.length() + 1];

        // 문자열 S를 순회하며 누적 등장 횟수를 계산하여 배열에 저장
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            for (int j = 0; j < 26; j++) {
                cumulativeCount[j][i + 1] = cumulativeCount[j][i];
            }
            cumulativeCount[ch - 'a'][i + 1]++;
        }

        StringBuilder sb = new StringBuilder();

        // 각 질문에 대해 결과를 StringBuilder에 추가
        for (int i = 0; i < q; i++) {
            String[] input = br.readLine().split(" ");
            char alpha = input[0].charAt(0);
            int l = Integer.parseInt(input[1]);
            int r = Integer.parseInt(input[2]);

            int count = cumulativeCount[alpha - 'a'][r + 1] - cumulativeCount[alpha - 'a'][l];
            sb.append(count).append("\n");
        }

        System.out.print(sb);
    }
}