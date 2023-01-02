function solution(array) {
    var answer = [];
    let max=-1;
    let position=-1;
    for(var i=0; i<array.length; i++){
        if(max<array[i]) {
            max=array[i];
            position=i;
        }
    }
    answer.push(max);
    answer.push(position);
    return answer;
}