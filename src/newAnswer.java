import java.util.*;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class newAnswer{
    public static void main(String[] args) {
        int number = 10;
        int limit = 3;
        int power = 2;

        ArrayList<Integer> knight = new ArrayList<>();
        //기사 배열
        for(int i =1; i <= number; i++){
            int count = 0;
            for(int j = 1; j * j <= i; j++){
                if (j * j == i) {
                    count++;
                } else if (i % j == 0) {
                    count += 2;
                }
            }
            knight.add(count);
            count = 0;
        }

        //배열에서 limit 확인하여 넘을 경우 power로 변경
        for(int i =0; i < knight.size(); i++){
            if(knight.get(i) > limit){
                knight.set(i, power);
            }
        }
        int answer = knight.stream().reduce(0,(a, b)->a + b);
        System.out.println(answer);
    }
}