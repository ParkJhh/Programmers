import java.lang.reflect.Array;
import java.util.*;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class newAnswer{
    public static void main(String[] args) {
        int n = 3;

        int answer = 0;
        int num1 = 1;
        int num2 = 1;

        if(n == 1 || n == 2){
            answer = 1;
        } else {
            for(int i = 3; i <= n; i++){
                answer = (num1+num2) % 1234567;
                //F(0)
                num1 = num2;
                //F(1)
                num2 = answer;
            }
        }
        System.out.println(answer);
    }
}

