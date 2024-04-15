package java.Lv1.정답률80_60;

public class 삼진법뒤집기 {
    public int solution(int n) {
        long n1= 0;
        String changeN = "";
        long answer = 0;


        //3진법 변환
        n1 = Long.parseLong(Integer.toString(n,3));

        //문자열로 변환
        changeN = String.valueOf(n1);
        //문자열 뒤집기
        StringBuffer sb = new StringBuffer(changeN);
        String reverse = sb.reverse().toString();
        long reverseN = Long.parseLong(reverse);

        //다시 변환
        answer = Long.parseLong(Long.toString(reverseN),3);
        return (int)answer;

    }
}
