import java.lang.reflect.Array;
import java.util.*;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class newAnswer{
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        int longMax = 1;
        int shortMax = 1;

        for(int i = 0; i < sizes.length; i++){
            //긴 길이의 최대
            int longer = Math.max(sizes[i][0], sizes[i][1]);
            //짦은 길이의 최소
            int shorter = Math.min(sizes[i][0], sizes[i][1]);
            //확인 후 교체하기
            if(longer > longMax) {
                longMax = longer;
            }
            if(shorter > shortMax) {
                shortMax = shorter;
            }
        }

        int answer = longMax * shortMax;
        System.out.println(answer);
    }
}

