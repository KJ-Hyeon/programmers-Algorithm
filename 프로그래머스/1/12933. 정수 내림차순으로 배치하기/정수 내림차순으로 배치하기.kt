class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        var newArr = n.toString().toCharArray().sortedArrayDescending()
        return String(newArr).toLong()
    }
}