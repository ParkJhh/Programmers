package java.Lv1.정답률100_80;

public class 수박수박수박수 {
    public String solution(int n) {
        String answer = "";

        for(int i = 0; i<n; i++){
            if( i % 2 ==1){
                answer += "박";
            } else {
                answer+= "수";
            }
        }
        return answer;
    }
}
