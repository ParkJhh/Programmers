function solution(n, arr1, arr2) {
    let cArr1 = [];
    let cArr2 = [];
    let result = [];
    let answer = [];
    //배열의 요소 이진수로 변환하며, 모자란 자리수는 앞부터 0으로 채우기
    arr1.forEach(element => {
        if(element.toString(2).length < n){
            cArr1.push("0".repeat(n-element.toString(2).length) + element.toString(2))
        } else {
            cArr1.push(element.toString(2))
        }
    });

    arr2.forEach(element =>{
        if(element.toString(2).length < n){
            cArr2.push("0".repeat(n-element.toString(2).length) + element.toString(2))
        } else {
            cArr2.push(element.toString(2))
        }
    })

    //변환된 이진수 각 자리 비교하여 하나라도 1이 있다면 1을 더한다
    let chk = ''
    for(let i =0; i < cArr1.length; i++){
        for(let j =0; j < cArr1.length; j++){
            if(cArr1[i][j] === '1' || cArr2[i][j] === '1'){
                chk += '1'
            } else {
                chk += '0'
            }
        }
        result.push(chk)
        chk = '';
    }

    //1,0을 #,공백으로 변환
    result.forEach(element => {
        answer.push(element.replaceAll('1','#').replaceAll('0',' '))
    })

    return answer;
}