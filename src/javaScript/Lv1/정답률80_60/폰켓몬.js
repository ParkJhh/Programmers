function solution(nums) {
    let chk = nums.length/2
    //중복제거
    arr = nums.filter((el, index) => nums.indexOf(el) === index);

    //중복 제거한 후 길이가 nums/2의 길이와 같거나 크다면
    if(chk >= arr.length){
        return arr.length
    } else if(chk < arr.length){
        return chk
    }
}