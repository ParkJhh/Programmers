function solution(s) {
    let x = s.split(" ")
    let answer = [];
    let chk = /[a-zA-Z]/

    for(i of x){
        if(chk.test(i.substring(0,1))){
            let head = (i.substring(0,1)).toUpperCase();
            let other = (i.substring(1)).toLowerCase();
            answer.push(`${head}${other}`)
        } else {
            answer.push(i.toLowerCase())
        }
    }
    return answer.join(" ")
}