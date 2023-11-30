class Solution {
    fun solution(s: String): String {
        var answer = arrayOf<String>()
        val splitWord = s.split(" ")
        splitWord.forEach { word ->
            var changeString = ""
            word.forEachIndexed { index, w ->
                changeString += if(index % 2 == 0) w.toUpperCase() else 
                w.toLowerCase()
            }
            answer += changeString
        }
        return answer.joinToString(" ")
    }
}