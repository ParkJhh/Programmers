package java.Lv1.정답률100_80;

import java.util.*;

public class 정수내림차순으로배치하기 {
    class Solution {
        public long solution(long n) {
            String newN = String.valueOf(n);
            String answer = "";
            long longAnswer = 0;
            //정렬하기 위해 배열 생성 후 담기
            Integer[] arr = new Integer[newN.length()];
            for(int i = 0; i <newN.length(); i++){
                arr[i] = Integer.parseInt(String.valueOf(newN.charAt(i)));
            }
            //역정렬후 캐릭터로 쪼개어서 담기
            Arrays.sort(arr, Collections.reverseOrder());
            for(int i = 0; i < newN.length(); i++){
                answer += String.valueOf(arr[i]);
            }
            longAnswer = Long.parseLong(answer);
            return longAnswer;
        }
    }
}
