function solution(n) {
    var answer = 0;
    var arr = String(n);
    for ( let i = 0; i < arr.length; i++) {
        answer += parseInt(arr[i]);
    }
    return answer;
}