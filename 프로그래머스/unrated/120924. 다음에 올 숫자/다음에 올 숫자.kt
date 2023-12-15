class Solution {
    fun solution(common: IntArray): Int {
        var answer: Int = 0
        val first = common[1] - common[0]
        val second = common[2] - common[1]
        answer = if(first == second) common[common.lastIndex] + first
        else common[common.lastIndex] * second/first
        return answer
    }
}