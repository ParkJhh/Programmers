package java.Lv1.정답률100_80;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int[] numbers2 = {0,1,2,3,4,5,6,7,8,9};
        int answer = 45;


        for (int i = 0; i < numbers.length; i++) {
            for(int j =0; j < numbers2.length; j++){
                if(numbers[i] == numbers2[j]){
                    answer -= numbers[i];
                }
            }
        }
        return answer;
    }
}
