class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var inputString = s
        val numbers = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" )
        for (i in 0 until numbers.size) {
            inputString = inputString.replace(numbers[i], i.toString())
        }
        answer = inputString.toInt()
        return answer
    }
}