class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        if(num1>0 && num1<=100 && num2>0 && num2<=100)
        answer = (num1.toDouble() / num2.toDouble() * 1000).toInt()
        return answer
    }
}