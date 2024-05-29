package java.Lv1.정답률80_60;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int longMax = 1;
        int shortMax = 1;

        for(int i = 0; i < sizes.length; i++){
            //긴 길이의 최대
            int longer = Math.max(sizes[i][0], sizes[i][1]);
            //짦은 길이의 최소
            int shorter = Math.min(sizes[i][0], sizes[i][1]);
            //확인 후 교체하기
            if(longer > longMax) {
                longMax = longer;
            }
            if(shorter > shortMax) {
                shortMax = shorter;
            }
        }

        int answer = longMax * shortMax;
        return answer;
    }
}
