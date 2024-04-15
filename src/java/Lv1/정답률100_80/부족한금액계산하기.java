package java.Lv1.정답률100_80;

public class 부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long longMoney = money;
        long newPrice =0;

        for(int i = 1; i <= count; i++){
            newPrice += (long) price * i;
        }
        //금액이부족하지 않은 경우
        if((newPrice - longMoney) < 0){
            return 0;
        }
        //금액이 부족한 경우
        answer = newPrice - longMoney;
        return answer;
    }
}
