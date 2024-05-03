package java.Lv2.정답률80_60;

public class 다음_큰_숫자 {
    public int solution(int n) {
        int answer = 0;
        //for문 길이 그냥 고정값
        for(int i = n+1; n <= 1000000; i++){
            //첫번째 조건
            if(i > n){
                int iOne = Integer.bitCount(i);
                int nOne = Integer.bitCount(n);
                //두번째 조건
                if(iOne == nOne){
                    answer = i;
                    break;
                }
            }
        }
        return answer;
    }
}
