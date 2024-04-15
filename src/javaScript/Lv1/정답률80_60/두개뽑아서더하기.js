function solution(numbers) {
    let answer = [];
    numbers.forEach(element => {
        for(let i =0; i < numbers.length; i++){
            //동일한 값이 아닌 값들을 더함
            if(element != numbers[i]){
                answer.push(element + numbers[i])
            }
            //동일한 값이나, 인덱스가 다르다면 더함
            if(numbers.indexOf(numbers[i]) != numbers.lastIndexOf(numbers[i])){
                answer.push(element + numbers[i])
            }
        }
    });
    let reAnswer = [...new Set(answer)]
    reAnswer.sort((a,b)=>{
        return a-b;
    })
    return reAnswer
}