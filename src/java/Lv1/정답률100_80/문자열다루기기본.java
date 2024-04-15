package java.Lv1.정답률100_80;

public class 문자열다루기기본 {
    public boolean solution(String s) {

        //문자열의 길이가 4 또는 6
        if (s.length() == 4 || s.length() == 6) {
            //숫자만으로 이루어져 있다면true 아니라면 false
            if (s.matches("[0-9]+")) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
