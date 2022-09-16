class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = -1
        val arr = IntArray(9) { it+1 }
        var sum = arr.sum()
        for(i in numbers){
            sum-=i
        }
        answer=sum
        return answer
    }
}