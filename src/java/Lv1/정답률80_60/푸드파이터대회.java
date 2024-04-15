package java.Lv1.정답률80_60;

public class 푸드파이터대회 {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i < food.length; i++){
            //여기서 반으로 나누기
            for(int j =0; j < food[i] / 2; j++){
                answer += i;
            }
        }
        //물더하기
        answer += 0;
        //역순으로 더하기
        for(int k = answer.length() -1; k > 0; k--){
            answer += answer.charAt(k -1);
        }
        return answer;

    }
}
