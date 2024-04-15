package java.Lv1.정답률100_80;

public class 내적 {
    public int solution(int[] a, int[] b) {
        int[] x = new int[a.length];
        int answer = 0;

        for(int i = 0 ; i < a.length; i++){
            x[i] = a[i] * b[i];
            answer += x[i];
        }
        return answer;
    }
}
