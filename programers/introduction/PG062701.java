
// 코딩테스트 연습/코딩테스트 입문/캐릭터의 좌표
class Solution {
  public int[] solution(String[] keyinput, int[] board) {
    int[] answer = { 0, 0 };

    // answer[0]는 x 좌표를, answer[1]은 y 좌표를 나타냅니다.
    for (int i = 0; i < keyinput.length; i++) {
      // switch 문을 사용하여 keyinput[i] 값에 따라 다른 동작을 수행합니다.
      switch (keyinput[i]) {
        case "up": // up인 경우, y 좌표를 증가시킵니다.
          answer[1]++;
          break;
        case "down": // down인 경우, y 좌표를 감소시킵니다
          answer[1]--;
          break;
        case "left": // left인 경우, x 좌표를 감소시킵니다.
          answer[0]--;
          break;
        case "right": // right인 경우, x 좌표를 증가시킵니다.
          answer[0]++;
          break;
      }
      // 만약 x 좌표의 절댓값이 board[0] / 2보다 크다면, 경계를 넘어가는 것이므로 한 칸 뒤로 이동합니다.
      // 이 때, x 좌표의 부호에 따라 이동 방향을 결정합니다.
      if (Math.abs(answer[0]) > board[0] / 2) {
        answer[0] += (answer[0] > 0) ? -1 : 1; // answer[0]이 양수인 경우, 오른쪽 경계를 넘어갔으므로 1을 빼줍니다.
      }
      if (Math.abs(answer[1]) > board[1] / 2) {
        answer[1] += (answer[1] > 0) ? -1 : 1; // answer[0]이 음수인 경우, 왼쪽 경계를 넘어갔으므로 1을 더해줍니다.
      }
    }
    return answer;
  }
}