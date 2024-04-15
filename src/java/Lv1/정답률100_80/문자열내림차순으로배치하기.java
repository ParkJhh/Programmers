package java.Lv1.정답률100_80;

import java.util.*;

public class 문자열내림차순으로배치하기 {
    public String solution(String s) {
        String answer = "";
        String[] change = new String[s.length()];
        //내림차순 정렬을 위해 담기
        for(int i =0; i < s.length(); i++){
            change[i] = String.valueOf(s.charAt(i));
        }
        //정렬
        Arrays.sort(change,Collections.reverseOrder());
        //문자열로 하나씩 변환
        for(int j =0; j < change.length; j++){
            answer += change[j];
        }
        return answer;
    }
}
