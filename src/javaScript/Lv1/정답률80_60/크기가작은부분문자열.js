function solution(t, p) {
    let chk =[];
    let answer = 0;
    for(let i =0; i < t.length; i++){
        chk.push(t.substring(i,i+p.length))
    }

    chk.forEach(element => {
        if(element.length == p.length){
            if(Number(element) <= Number(p)){
                answer++;
            }
        }
    });
    return answer
}