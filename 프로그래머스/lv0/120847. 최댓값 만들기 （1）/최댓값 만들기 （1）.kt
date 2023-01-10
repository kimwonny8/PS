class Solution {
    fun solution(arr: IntArray): Int {
        var answer: Int = 0
         arr.sort()
        answer = arr[arr.size-1]*arr[arr.size-2]
        
        return answer
    }
}