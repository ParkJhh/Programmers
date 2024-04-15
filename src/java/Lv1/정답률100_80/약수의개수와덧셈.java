package java.Lv1.정답률100_80;

public class 약수의개수와덧셈 {
    public int solution(int left, int right) {
        //1과 자기자신
        int count = 2;
        int answer = 0;

        if(left == right) {
            return answer;
        }
        //숫자 배열
        int[] arr = new int[(right-left)+1];
        //약수 개수 배열
        int[] arr2 = new int[(right-left)+1];

        //약수 개수 계산하여 배열에 담기
        for(int i = 0; i < arr.length; i++){
            arr[i] = left + i;
            if (arr[i] != 1) {
                arr2[i] = count;
            } else {
                arr2[i] = 1;
            }
            for(int j =2; j < arr[i] ; j++){
                if(arr[i] % j == 0){
                    arr2[i] += 1;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr2[i] % 2 == 0){
                answer += arr[i];
            } else if(arr2[i] % 2 != 0){
                answer -= arr[i];
            }
        }
        return answer;
    }
}
