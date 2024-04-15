function solution(strings, n) {
    strings.sort((a, b) => {
        if (a.substr(n,1) > b.substr(n,1) ) return 1;
        //뽑아낸 문자가 동일할 경우
        if ((a.substr(n,1) == b.substr(n,1)) &&(a > b)) return 1
        if ((a.substr(n,1) == b.substr(n,1)) &&(a == b)) return 0
        if ((a.substr(n,1) == b.substr(n,1)) &&(a < b)) return -1

        if (a.substr(n,1) < b.substr(n,1)) return -1;
    });
    return strings
}