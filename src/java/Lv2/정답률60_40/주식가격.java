package java.Lv2.정답률60_40;

import java.util.*;

public class 주식가격 {
    public ArrayList<Integer> solution(int[] prices) {
        int count = 0;
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i =0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++){
                if(prices[i] <= prices[j]){
                    count++;
                } else {
                    count++;
                    break;
                }
            }
            answer.add(count);
            count = 0;
        }
        return answer;
    }
}
