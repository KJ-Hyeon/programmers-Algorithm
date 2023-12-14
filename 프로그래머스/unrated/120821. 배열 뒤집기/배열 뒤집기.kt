class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        answer = num_list.reversed().toIntArray()
        return answer
    }
}