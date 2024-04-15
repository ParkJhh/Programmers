function solution(a, b) {
    let week = ['SUN','MON','TUE','WED','THU','FRI','SAT'];
    let dayOfWeek = new Date(`2016-${a}-${b}`).getDay();
    let todayWhat = week[dayOfWeek];
    return todayWhat
}