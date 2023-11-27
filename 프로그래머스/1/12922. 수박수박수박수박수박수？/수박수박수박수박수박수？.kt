class Solution {
    fun solution(n: Int): String {
        var answer = ""
        repeat(n) { count ->
            answer += if (count % 2 == 0) "수" else "박"
        }
        return answer
    }
}