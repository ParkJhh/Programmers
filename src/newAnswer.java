import java.util.*;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class newAnswer{
    public static void main(String[] args) {


        int nums[] = {1,2,7,6,4};
        int answer = 0;

        for(int i =0; i < nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                for(int k=j+1; k< nums.length; k++){
                    if(primeChk(nums[i] + nums[j] + nums[k])){
                        System.out.println(nums[i] + "+" + nums[j] + "+" + nums[k]);
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }

    static boolean primeChk(int number) {
        if (number <= 1) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
