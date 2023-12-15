class Solution {
    fun solution(num: Int, total: Int): IntArray {
        val answer = mutableListOf<Int>()
        var data = total / num

        for (i in 0 until num) {
            data += if (i % 2 == 0) -i else i
            answer.add(data)
        }

        return answer.sorted().toIntArray()
    }
}