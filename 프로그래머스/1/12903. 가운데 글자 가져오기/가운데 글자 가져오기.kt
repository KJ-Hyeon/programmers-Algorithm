class Solution {
     fun solution(s: String): String {
        var answer = ""
        answer = if(s.length % 2 == 0) {
            "${s[s.length / 2 - 1]}"+"${s[s.length / 2]}"
        } else {
            "${s[s.length / 2]}"
        }
        return answer
    }
}