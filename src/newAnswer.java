import java.lang.reflect.Array;
import java.util.*;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class newAnswer{
    public static void main(String[] args) {
        int n = 78;
        int answer = 0;
        //for문 길이 그냥 고정값;
        for(int i = n+1; n <= 1000000; i++){
            //첫번째 조건
            if(i > n){
                int iOne = Integer.bitCount(i);
                int nOne = Integer.bitCount(n);
                //두번째 조건
                if(iOne == nOne){
                    answer = i;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
