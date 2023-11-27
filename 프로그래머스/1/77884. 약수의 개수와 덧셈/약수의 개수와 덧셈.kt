class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        var count : Int = 0
        for (i in left..right) {
            for (j in 1..i) {
                if (i % j == 0) count++
            }
            if (count % 2 == 0) answer += i else answer -= i
            count = 0
        }
        return answer
    }
}