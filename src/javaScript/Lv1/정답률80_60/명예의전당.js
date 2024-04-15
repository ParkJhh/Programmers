function solution(k, score) {
    //전당
    let board = []
    //리턴배열
    let answer = []
    // 초기 k일차까지의 값 세팅
    for(let i = 0 ; i < k; i ++) {
        board.push(score[i])
        //오름차순 정렬
        board.sort((a,b) => a-b)
        //가장 낮은값 리턴배열에 추가
        answer.push(board.at(0))
    }
    //k일 넘어서부터
    for(let i = k; i < score.length; i++){
        //명예의 전당 최하위 점수보다 큰 경우
        if(score[i]>Math.min(...board)) {
            //가장 작은 수를 교체 후 오름차순 정렬
            board.shift()
            board.unshift(score[i])
            board.sort((a,b) => a-b)
        }
        //명예의 전당 중 최하위 점수 입력
        answer.push(board.at(0))
    }
    //k가 score의 길이보다 길 경우
    if(k > score.length){
        for(let i = score.length; i < k; i++){
            answer.pop()
        }
    }
    return answer
}