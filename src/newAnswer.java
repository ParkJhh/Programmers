import java.lang.reflect.Array;
import java.util.*;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class newAnswer{
    public static void main(String[] args) {
        int n = 15;
        int answer = 0;

        for(int i = 1; i <= n; i++){
            int chk = i;
            for (int j = i+1; chk < n; j++){
                chk +=j;
            }
            if(chk == n) answer++;
        }
        System.out.println(answer);
    }
}
