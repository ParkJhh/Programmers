package java.Lv1.정답률80_60;

public class 소수_만들기 {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i =0; i < nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                for(int k=j+1; k< nums.length; k++){
                    if(primeChk(nums[i] + nums[j] + nums[k])){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    static boolean primeChk(int number) {
        if (number <= 1) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
