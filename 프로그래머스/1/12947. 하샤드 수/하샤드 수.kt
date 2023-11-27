class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        val number = x.toString().toList().sumOf{it.digitToInt()}
        answer = if(x % number == 0) true else false
        return answer
    }
}