import java.lang.reflect.Array;
import java.util.*;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class newAnswer{
    public static void main(String[] args) {

        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may"},{"kein", "deny", "may"}, {"kon", "coni"}};


        ArrayList<Integer> answer = new ArrayList<>();
        int point = 0;
        ArrayList<String> nameChk = new ArrayList<>();
        for(int i =0; i < name.length; i++){
            nameChk.add(name[i]);
        }


        for(int i =0; i < photo.length; i++){
            for(int j = 0; j< photo[i].length; j++){
                if(nameChk.contains(photo[i][j])){
                    int x = nameChk.indexOf(photo[i][j]);
                    point += yearning[x];
                }
            }
            answer.add(point);
            point = 0;
        }


        System.out.println(answer);
    }
}
