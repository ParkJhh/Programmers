import java.lang.reflect.Array;
import java.util.*;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class newAnswer{
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1,30 ,5};

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
                if(j == answer.size() -1){
                    dayCount.add(logic);
                    i = j;
                    break;
                }
            }
            logic = 0;
        }
        System.out.println(dayCount);
    }
}
