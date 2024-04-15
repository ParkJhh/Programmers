package java.Lv1.정답률100_80;

public class 정수제곱근판별 {
    public long solution(long n) {
        long answer = 0;

        //i가 1일 경우, 실패하는 테스트케이스
        for(long i =0; i <= n; i++){
            if(i * i ==n){
                return ((i + 1) * (i + 1));
            } else {
                answer = -1;
            }
        }

        return answer;
    }
}
