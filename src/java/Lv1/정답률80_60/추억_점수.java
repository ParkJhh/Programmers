package java.Lv1.정답률80_60;

import java.util.*;

public class 추억_점수 {
    public ArrayList<Integer> solution(String[] name, int[] yearning, String[][] photo) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<String> nameChk = new ArrayList<>();

        int point = 0;
        //비교용 새로담기
        for(int i =0; i < name.length; i++){
            nameChk.add(name[i]);
        }

        for(int i =0; i < photo.length; i++){
            for(int j = 0; j< photo[i].length; j++){
                if(nameChk.contains(photo[i][j])){
                    int x = nameChk.indexOf(photo[i][j]);
                    point += yearning[x];
                }
            }
            answer.add(point);
            point = 0;
        }
        return answer;
    }
}
