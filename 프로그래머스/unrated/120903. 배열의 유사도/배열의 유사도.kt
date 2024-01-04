class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0
        for(i in s2) {
            if(s1.contains(i)) answer++
        }
        return answer
    }
}