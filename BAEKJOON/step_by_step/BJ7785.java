
// 7785 회사에 있는 사람
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    HashMap<String, Boolean> hashMap = new HashMap<>();

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String name = st.nextToken();
      String type = st.nextToken();

      if (type.equals("enter")) {
        hashMap.put(name, true);
      } else if (type.equals("leave")) {
        hashMap.replace(name, false);
      }
    }

    Object[] arrKey = hashMap.keySet().toArray();
    Arrays.sort(arrKey, Collections.reverseOrder());

    for (Object s : arrKey) {
      if (hashMap.get(s))
        bw.write(s + "\n");
    }
    br.close();
    bw.close();
  }
}
