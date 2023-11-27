class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        if(n>0 && n<=1000) {
            for(i in 1..n) {
                if(i % 2 == 0) answer += i
            }
        }
        return answer
    }
}