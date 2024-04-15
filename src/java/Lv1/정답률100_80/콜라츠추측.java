package java.Lv1.정답률100_80;

public class 콜라츠추측 {
    public int solution(int num) {
        int count = 0;
        //계산시 오버플로우 발생하므로 롱타입으로 다시 담음
        long newNum = num;
        //수 체크
        if(num == 1){
            return 0;
        }
        //해당되지 않을 경우
        for(count = 0; newNum != 1; count++){
            if(newNum % 2 ==0){
                newNum = newNum/2;

            } else {
                newNum = (newNum * 3) + 1;

            }
        }
        //카운트 체크
        if(count > 500){
            return -1;
        }
        return count;
    }
}
