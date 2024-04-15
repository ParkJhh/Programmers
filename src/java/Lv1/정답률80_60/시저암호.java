package java.Lv1.정답률80_60;

public class 시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        int temp =0;


        for (int i = 0; i < s.length(); i++) {
            //공백
            if (String.valueOf(s.charAt(i)).equals(" ")) {
                answer += " ";
            } else {
                //소문자 범위 안 소문자는 소문자로 민다
                if (((int) s.charAt(i) > 96 && (int) s.charAt(i) < 123)) {
                    if((int) s.charAt(i) + n > 122){
                        temp = (s.charAt(i) + n) - 26;
                        answer += (char)temp;
                    } else {
                        answer += (char) (s.charAt(i) + n);
                    }
                    //대문자 범위 안 대문자는 대문자로 민다
                } else if(((int) s.charAt(i) > 64 && (int) s.charAt(i) < 91)){
                    if((int) s.charAt(i) + n > 90){
                        temp = (s.charAt(i) + n) - 26;
                        answer += (char)temp;
                    } else {
                        answer += (char) (s.charAt(i) + n);
                    }
                }
            }
        }
        return answer;
    }
}
