class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var cola = n
        while (cola >= a) {
            val receive = cola / a * b
            cola = cola % a + receive
            answer += receive
        }
        return answer
    }
}