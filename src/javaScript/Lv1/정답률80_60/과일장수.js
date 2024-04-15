function solution(k, m, score) {
    let answer = 0;
    //내림차순 정렬
    score.sort((a,b) => b-a)

    for(let i = m -1; i < score.length; i +=m){
        //담아야 할 것중 가장 작은 값으로 접근
        answer += score[i] * m;
    }
    return answer;
}