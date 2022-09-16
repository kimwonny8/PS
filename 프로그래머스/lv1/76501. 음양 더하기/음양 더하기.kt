class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0
        var num =0
        for(i in absolutes.indices){
            if(!signs[i]) {
                num = absolutes[i]*-1
            }
            else num = absolutes[i]
            answer+=num
        }
        
        
        return answer
    }
}