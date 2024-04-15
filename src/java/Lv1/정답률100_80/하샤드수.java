package java.Lv1.정답률100_80;

public class 하샤드수 {
    public boolean solution(int x) {
        String newX = String.valueOf(x);
        int changeX = 0;

        for(int i = 0; i < newX.length(); i++){
            changeX += Integer.parseInt(String.valueOf(newX.charAt(i)));
        }

        if(x % changeX == 0){
            return true;
        }
        return false;

    }
}
