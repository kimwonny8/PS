class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = 0
        var sum:Long =0
        for(i in 1..count){
            sum+=price*i
        }
        if(sum>money) answer=sum-money
        
        return answer
    }
}