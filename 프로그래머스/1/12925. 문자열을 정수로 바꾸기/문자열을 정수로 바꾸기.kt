class Solution {
    fun solution(s: String): Int {
        var answer = 0
        if(s.length>=1 && s.length<=5) {
            answer = s.toInt()
        }
        return answer
    }
}