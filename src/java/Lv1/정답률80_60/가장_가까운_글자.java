package java.Lv1.정답률80_60;

import java.util.*;
public class 가장_가까운_글자 {
    public ArrayList<Integer> solution(String s) {
        ArrayList<Character> chk = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i =0; i < s.length(); i++){
            if(chk.contains(s.charAt(i))){
                answer.add(i - chk.lastIndexOf(s.charAt(i)));
            } else {
                answer.add(-1);
            }
            chk.add(s.charAt(i));
        }
        return answer;
    }
}
