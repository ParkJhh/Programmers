function solution(s){
    answer = true
    let cal = 0;
    //s 순회
    for(let i =0; i < s.length; i++){
        if(s[i] === "("){
            cal++;
        } else {
            cal--;
        }
        //잘못 닫히는 경우 즉시종료
        if(cal < 0)break;
    }
    if(cal !==0)answer = false;
    return answer;
}