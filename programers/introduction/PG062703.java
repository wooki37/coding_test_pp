
// 코딩테스트 연습/코딩테스트 입문/로그인 성공?
class Solution {
  public String solution(String[] id_pw, String[][] db) {
    String answer = "";

    for (int i = 0; i < db.length; i++) {
      if (id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
        answer = "login";
        break;
      } else if (id_pw[0].equals(db[i][0]) && id_pw[1] != db[i][1]) {
        answer = "wrong pw";
        break;
      } else {
        answer = "fail";
      }
    }

    return answer;
  }
}