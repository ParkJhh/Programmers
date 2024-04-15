package java.Lv1.정답률100_80;

public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
        String answer = "";
        //뒷 4자리 전까지 별로 변환
        for(int i = 0; i < phone_number.length()-4; i++){
            answer += "*";
        }
        //4자리부터 그대로 받아서 입력
        for(int i = phone_number.length()-4; i < phone_number.length(); i++){
            answer += phone_number.charAt(i);
        }
        return answer;
    }
}
