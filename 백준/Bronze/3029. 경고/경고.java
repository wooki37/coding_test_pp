import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sTime = timeToSeconds(br.readLine());
        int eTime = timeToSeconds(br.readLine());
        
        int wait = (eTime + 24 * 3600 - sTime) % (3600 * 24);
        int hour = wait / 3600, min = (wait % 3600) / 60, sec = wait % 60;
        
        System.out.printf(sTime == eTime ? "24:00:00" : "%02d:%02d:%02d\n", hour, min, sec);
        br.close();
    }
    
    static int timeToSeconds(String time) {
        StringTokenizer stk = new StringTokenizer(time, ":");
        return stoi(stk.nextToken()) * 3600 + stoi(stk.nextToken()) * 60 + stoi(stk.nextToken());
    }
    
    static int stoi(String str) {
        return Integer.parseInt(str);
    }
}
