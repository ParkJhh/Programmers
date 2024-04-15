package java.Lv1.정답률100_80;

public class 문자열정수로바꾸기 {
    public int solution(String s) {
        String answer = "";
        if (String.valueOf(s.charAt(0)).equals("-")) {
            for (int i = 0; i < s.length(); i++) {
                answer += s.charAt(i);
            }
        } else {
            for (int i = 0; i < s.length(); i++) {
                answer += s.charAt(i);
            }
        }
        return Integer.parseInt(answer);
    }
}
