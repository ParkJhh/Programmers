function solution(s) {
    let chk = s.split(' ')
    let answer = ''
    chk.forEach((element) =>{
        for(let i =0; i < element.length; i++){
            if(i% 2 == 0){
                answer += element[i].toUpperCase();
            } else {
                answer += element[i].toLowerCase();
            }
        }
        answer += ' '
    })
    return answer.substring(0,answer.length-1)
}