import java.util.*;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class newAnswer{
    public static void main(String[] args) {
        String s = "banana";
        ArrayList<Character> chk = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i =0; i < s.length(); i++){
            if(chk.contains(s.charAt(i))){
                answer.add(i - chk.lastIndexOf(s.charAt(i)));
            } else {
                answer.add(-1);
            }
            chk.add(s.charAt(i));
        }
        System.out.println(answer);
    }
}
