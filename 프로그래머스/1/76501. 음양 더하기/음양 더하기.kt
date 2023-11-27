class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0
        for (i in signs.indices) {
            answer += if (signs[i]) absolutes[i] else absolutes[i] * -1
        }
        return answer
    }
}