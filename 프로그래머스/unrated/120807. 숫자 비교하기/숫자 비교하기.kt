class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        if(num1>=0 && num1<=10000 && num2>=0 && num2<=10000) {
            if(num1.equals(num2)) answer = 1 else answer = -1
        }
        return answer
    }
}