import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // <선수명, 등수> Map 생성
        Map<String, Integer> playerToRank = new HashMap<>();

        // 선수들의 이름과 초기 등수를 매핑
        for (int i = 0; i < players.length; i++) {
            playerToRank.put(players[i], i);
        }

        // 해설진이 부른 이름을 순서대로 확인하며 추월된 선수의 등수 변경
        for (String calling : callings) {
            int rank = playerToRank.get(calling);
            String beforePlayer = players[rank - 1];
            
            players[rank - 1] = calling;
            players[rank] = beforePlayer;
            
            playerToRank.put(calling, rank - 1);
            playerToRank.put(beforePlayer, rank);
        }
        return players;
    }
}