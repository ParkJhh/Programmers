package java.Lv1.정답률100_80;

public class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        //길이가 홀수 일경우
        if((s.length() % 2) != 0){
            answer += String.valueOf(s.charAt(s.length() / 2));
        } else {
            //짝수일경우
            answer += String.valueOf(s.charAt((s.length() / 2)-1));
            answer += String.valueOf(s.charAt(s.length() / 2));
        }
        return answer;
    }
}
