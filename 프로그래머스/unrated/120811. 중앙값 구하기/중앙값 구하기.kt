class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        var index: Int = 0
        array.sort()
        index = if(array.size % 2 == 0) {
            array.size / 2 - 1
        } else {
            array.size / 2 
        }
        answer = array[index]
        return answer
    }
}