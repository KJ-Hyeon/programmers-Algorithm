class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = arrayOf<String>()
        answer = strings.also {
            it.sort()
            it.sortBy{it[n]}
        }
        return answer
    }
}