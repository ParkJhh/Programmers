import java.lang.reflect.Array;
import java.util.*;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class newAnswer{
    public static void main(String[] args) {

        int []A = {1, 2};
        int []B = {1,2,3,4,5,6,7,8,9};
        int answer = 0;
        ArrayList<Integer> newA = new ArrayList<>();
        ArrayList<Integer> newB = new ArrayList<>();

        //A는 오름차순, B는 내림차순
        Arrays.sort(A);
        for(int i=0; i<B.length; i++){
            newB.add(B[i]);
        }
        newB.sort(Collections.reverseOrder());

        System.out.println(newA);
        System.out.println(newB);

        //길이가 가장 짦은 것으로 계산
        for(int i =0; i< A.length; i++){
            answer += A[i] * newB.get(i);
        }
        System.out.println(answer);
    }
}
