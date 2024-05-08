package java.Lv2.정답률80_60;

import java.util.*;

public class 기능_개발 {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        //날짜 계산
        int day = 0;
        for(int i = 0; i < progresses.length; i++){
            for(int j =0; j <= 100; j++){
                progresses[i] += speeds[i];
                day++;
                if(progresses[i] >= 100){
                    answer.add(day);
                    day = 0;
                    break;
                }
            }
        }
        System.out.println(answer);

        ArrayList<Integer> dayCount = new ArrayList<>();
        int logic = 0;
        //앞의 기능이 되어야만함
        for(int i =0; i < answer.size(); i++){
            for(int j = i; j < answer.size(); j++){
                if(answer.get(i) >= answer.get(j)){
                    logic++;
                } else {
                    dayCount.add(logic);
                    i = j - 1;
                    break;
                }
                //마지막 비교인 경우
                if(j == answer.size() -1){
                    dayCount.add(logic);
                    i = j;
                    break;
                }
            }
            logic = 0;
        }
        return dayCount;
    }

}
