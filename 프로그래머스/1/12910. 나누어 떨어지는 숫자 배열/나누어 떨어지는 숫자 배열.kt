class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = mutableListOf<Int>()
        for (num in arr) {
            if (num % divisor == 0) answer.add(num)
        }
        if(answer.size == 0) answer.add(-1)
        return answer.toIntArray().sortedArray()
    }
}