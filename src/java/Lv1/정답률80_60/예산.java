package java.Lv1.정답률80_60;

import java.util.*;

public class 예산 {

    class Solution {
        public int solution(int[] d, int budget) {
            int sum = 0;
            int count =0;

            Arrays.sort(d);
            for(int i = 0; i < d.length; i++){
                sum += d[i];
                count++;
                //예산 초과할경우
                if(sum > budget){
                    return (count -1);
                }

            }
            return count;
        }
    }
}
