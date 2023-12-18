class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        array.map{
            it.toString().split("").forEach {
                if(it == "7") answer++
            }
        }
        return answer
    }
}