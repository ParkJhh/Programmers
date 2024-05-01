package java.Lv2.정답률80_60;

public class 숫자의_표현 {
    //for문 효율성 개선
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++){
            int chk = i;
            for (int j = i+1; chk < n; j++){
                chk +=j;
            }
            if(chk == n) answer++;
        }
        return answer;
    }

    //효율성 개선 전
    public int beforeSolution(int n) {
        int answer = 0;
        int chk = 0;

        for(int i = 1; i <= n; i++){
            for (int j = i; j <= n+1; j++){
                chk +=j;
                if(chk == n){
                    answer++;
                    break;
                }
            }
            chk = 0;
        }
        return answer;
    }
}
