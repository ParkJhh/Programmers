package java.Lv2.정답률80_60;

import java.util.*;

public class 최솟값_만들기 {
    public int solution(int []A, int []B) {
        int answer = 0;

        ArrayList<Integer> newB = new ArrayList<>();
        //A는 오름차순, B는 내림차순
        Arrays.sort(A);
        for(int i=0; i<B.length; i++){
            newB.add(B[i]);
        }
        newB.sort(Collections.reverseOrder());

        //길이가 가장 짦은 것으로 계산
        for(int i =0; i< A.length; i++){
            answer += A[i] * newB.get(i);
        }

        return answer;
    }
}
