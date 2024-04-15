package java.Lv1.정답률100_80;

public class 자연수뒤집어배열로만들기 {
    class Solution {
        public long[] solution(long n) {
            String change = String.valueOf(n);
            Long[] arr = new Long[change.length()];

            //하나씩 뽑아 배열로 다시담기
            for(int i =0; i < change.length(); i++){
                arr[i] = Long.parseLong(String.valueOf(change.charAt(i)));
            }

            //배열 생성
            long[] arr2 = new long[arr.length];
            for(int i =0; i <= arr.length; i++){
                arr2[i] = arr[arr.length -1 -i];
                if(arr.length -1 -i == 0){
                    return arr2;
                }
            }
            return arr2;
        }
    }
}
