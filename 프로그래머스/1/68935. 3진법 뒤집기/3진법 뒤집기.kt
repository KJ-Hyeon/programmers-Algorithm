class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var base3 = n.toString(3)
        answer = base3.reversed().toInt(3)
        return answer
    }
}