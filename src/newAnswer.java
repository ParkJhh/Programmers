import java.lang.reflect.Array;
import java.util.*;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class newAnswer{
    public static void main(String[] args) {
        int n = 4;
        int m = 1;
        int[] section = {1,2,3,4};

        int start = section[0];
        int end = section[0] + (m-1);
        int answer = 1;

        //n이 필요한가???
        for(int i : section){
            if(i >= start && i <= end)
                continue;
            else{
                start = i;
                end = i + (m-1);
                answer++;
            }
        }
        System.out.println(answer);
    }
}

