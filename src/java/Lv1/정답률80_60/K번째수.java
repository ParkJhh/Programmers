package java.Lv1.정답률80_60;
import java.util.*;
public class K번째수 {
    public  ArrayList<Integer> solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i =0; i < commands.length; i++){
            int[] temp = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(temp);
            answer.add(temp[commands[i][2]-1]);
        }

        return answer;
    }
}
