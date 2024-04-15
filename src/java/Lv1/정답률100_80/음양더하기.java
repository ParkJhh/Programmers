package java.Lv1.정답률100_80;

public class 음양더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer =0;
        //비교후 배열 다시 담기
        for(int i =0; i < absolutes.length; i++){
            if(signs[i] == false){
                absolutes[i] = absolutes[i] * -1;
            }
        }
        //계산
        for(int j =0; j < absolutes.length; j++){
            answer += absolutes[j];
        }
        return answer;
    }
}
