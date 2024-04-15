function solution(n, m) {
    let MaxNum = 1;
    let MinNum = 1;
    let answer = []
    //최대공약수
    for(let i=2; i<=Math.min(n, m); i++){
        if(n % i === 0 && m % i === 0){
            MaxNum = i;
        }
    }
    answer.push(MaxNum)
    //최소공배수
    MinNum = (n * m) / MaxNum
    answer.push(MinNum)

    return answer;
}