class Solution {
    fun solution(arr: IntArray): Int {
        arr.sort()
        var max = 0
        var tmp1 = arr[arr.size-1]*arr[arr.size-2]
        var tmp2 = arr[0]*arr[1]

        if(tmp1 > tmp2) max = tmp1
        else max = tmp2

        return max
    }
}