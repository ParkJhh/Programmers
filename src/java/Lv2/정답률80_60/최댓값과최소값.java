package java.Lv2.정답률80_60;

import java.util.*;

public class 최댓값과최소값 {
    public String solution(String s) {
        String[] newS = s.split(" ");
        int[] answer = new int[newS.length];
        String reanswer ="";

        for(int i =0; i < newS.length; i++){
            answer[i] = Integer.parseInt(newS[i]);
        }
        Arrays.sort(answer);

        for(int j =0; j < answer.length; j++){
            if(j == 0){
                reanswer += answer[0] + " ";
            }
            if(j + 1 == answer.length){
                reanswer += answer[answer.length-1];
            }
        }
        return reanswer;
    }
}
