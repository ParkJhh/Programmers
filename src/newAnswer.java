import java.lang.reflect.Array;
import java.util.*;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class newAnswer{
    public static void main(String[] args) {

        int[] prices = {4,3,2,1};
        int count = 0;
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i =0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++){
                if(prices[i] <= prices[j]){
                    count++;
                } else {
                    count++;
                    break;
                }
            }
            answer.add(count);
            count = 0;
        }
        System.out.println(answer);
    }
}
