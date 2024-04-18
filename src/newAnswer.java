import java.util.*;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class newAnswer{
    public static void main(String[] args) {
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};

        int[] answer = new int[2];

        int HitCount = 0;
        int ZeroCount = 0;
        //맞은게 몇개인지 체크
        for(int i = 0; i < lottos.length; i++){
            //0이면 못읽은 수로 넘김
            if(lottos[i] == 0 ){
                ZeroCount++;
            } else {
                for (int j = 0; j < win_nums.length; j++) {
                    if (lottos[i] == win_nums[j]) {
                        HitCount++;
                    }
                }
            }
        }
        int maxRank = HitCount + ZeroCount;
        int minRank = HitCount;

        answer[0] = rankCount(maxRank);
        answer[1] = rankCount(minRank);
        System.out.println(Arrays.toString(answer));
    }
    static int rankCount(int number){
        if(number == 0) return 6;
        if(number == 1) return 6;
        if(number == 2) return 5;
        if(number == 3) return 4;
        if(number == 4) return 3;
        if(number == 5) return 2;
        if(number == 6) return 1;
        return 0;
    }
}
