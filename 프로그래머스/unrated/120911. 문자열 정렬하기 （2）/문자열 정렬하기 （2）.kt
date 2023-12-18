class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        answer = my_string.toLowerCase().toCharArray().sorted().joinToString("")
        return answer
    }
}