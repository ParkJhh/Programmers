package java.Lv1.정답률100_80;

public class 자릿수더하기 {
    public int solution(int n) {
        int sum = 0;

        String newN = String.valueOf(n);
        for(int i= 0; i < newN.length(); i++){
            sum += Integer.parseInt(String.valueOf(newN.charAt(i)));
        }
        return sum;
    }
}
