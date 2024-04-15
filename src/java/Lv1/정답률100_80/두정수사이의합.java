package java.Lv1.정답률100_80;

public class 두정수사이의합 {
    public long solution(int a, int b) {
        long firstNum = 0;
        long secondNum =0;
        long answer = 0;
        //순서 정해주기
        if(a-b < 0){
            secondNum = a;
            firstNum = b;
        } else if(a-b ==0){
            return a;
        } else if(a-b > 0){
            secondNum = b;
            firstNum = a;
        }

        for(long i = secondNum; i <= firstNum; i++){
            answer += i;
        }
        return answer;
    }
}
