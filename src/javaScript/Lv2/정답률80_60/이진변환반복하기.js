function solution(s) {
    let zeroCount = 0;
    let tryCount =0;
    let str = ''
    s = s.split('')
    let answer = [];

    while(s.length > 1){
        //와일문 실행시 카운트업
        tryCount++
        //2진수를 split한 배열 순회
        s.forEach(e =>{
            if(e == '1'){
                str += e;
            } else {
                zeroCount++;
            }
        })
        //1이 추가된 배열의 길이를 이진수로 변환하여 split
        s = ((str.length).toString(2)).split('')
        str = '';
    }

    answer.push(tryCount)
    answer.push(zeroCount)
    return answer;
}