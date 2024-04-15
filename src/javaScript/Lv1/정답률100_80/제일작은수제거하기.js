function solution(arr) {
    let answer =[]
    //배열 복사
    const chk = arr.slice(0)
    //가장 작은 수 담을 변수
    let x = 0;

    if(arr.length === 1){
        answer.push(-1)
        return answer;
    } else {
        //sort메서드는 기본적으로 문자열로 변환 후, 정렬한다.따라서 비교식 추가
        chk.sort((a,b) => a-b)
        x = chk[0]
    }

    for(let i =0; i < arr.length; i++){
        if(arr[i] !== x){
            answer.push(arr[i])
        }
    }
    return answer
}