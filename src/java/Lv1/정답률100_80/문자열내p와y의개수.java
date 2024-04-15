package java.Lv1.정답률100_80;

public class 문자열내p와y의개수 {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        for(int i= 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                pCount++;
            }
        }
        for(int i= 0; i < s.length(); i++){
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                yCount++;
            }
        }
        if(pCount == yCount){
            return true;
        } else {
            return false;
        }
    }
}
