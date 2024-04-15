function solution(a, b, n) {
    //카운트
    let count = 0;

    while(n >= a){
        count += (Math.floor(n/a) * b)
        n = n - (Math.floor(n/a) * a) + (Math.floor(n/a) * b)
    }
    return count;
}