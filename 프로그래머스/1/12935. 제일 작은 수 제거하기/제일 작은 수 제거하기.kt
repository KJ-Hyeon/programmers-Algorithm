import kotlin.math.*
    
class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf()
        answer = arr.filter {it != arr.minOf{it}}.toIntArray()
        if(arr.size == 1) answer += -1
        return answer
    }
}