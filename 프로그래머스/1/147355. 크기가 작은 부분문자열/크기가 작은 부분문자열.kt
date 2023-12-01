class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        for(i in 0 .. t.length - p.length) {
            val splitNum = t.substring(i, p.length + i )
            if(splitNum.toLong() <= p.toLong())
                answer++
        }
        return answer
    }
}