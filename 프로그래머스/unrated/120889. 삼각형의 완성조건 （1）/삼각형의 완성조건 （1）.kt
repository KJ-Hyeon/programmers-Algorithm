class Solution {
    fun solution(sides: IntArray): Int {
        var answer: Int = 0
        sides.sort()
        answer = if(sides[2] < sides[0] + sides[1]) 1 else 2
        return answer
    }
}