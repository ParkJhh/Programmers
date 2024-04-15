package java.Lv1.정답률100_80;

import java.util.*;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        int count= 0;
        //리턴 배열에 사용
        int number =0;

        //배열 길이 생성을 위한 카운트
        for(int i = 0 ; i < arr.length; i++){
            if((arr[i] % divisor) == 0){
                count++;
            }
        }
        //나누어 떨어지는 숫자가 없는 경우
        if(count == 0){
            int[] answer = {-1};
            return answer;
        }
        //나누어 떨어지는 숫자가 있는 경우
        int[] answer = new int[count];
        for(int i = 0 ; i < arr.length; i++){
            if((arr[i] % divisor) == 0){
                answer[number] = arr[i];
                number++;
            }
        }
        //정렬
        Arrays.sort(answer);
        return answer;
    }
}
