package java.Lv1.정답률80_60;

public class 소수_찾기 {

    //효율성 시간초과로 인해 아래를 참조하여 에라토스테네스의 체를 사용
    //https://colabear754.tistory.com/31
    class Solution {
        public int solution(int n) {

            boolean[] isPrime = new boolean[n + 1];
            for (int i = 2; i < isPrime.length; i++) {
                isPrime[i] = true;
            }
            for (int i = 2; i * i <= n; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= n; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            int answer= 0;
            for (int i = 2; i < isPrime.length; i++) {
                if (isPrime[i]) answer++;
            }
            return answer;
        }
    }

    //기존 제출
    class findSolution {
        public int solution(int n) {
            int answer = 0;
            for(int i = 2; i <= n; i++){
                if(primeChk(i)){
                    answer++;
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
}
