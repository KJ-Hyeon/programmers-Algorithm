class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
    var answer: IntArray = intArrayOf()
    val honorList = arrayListOf<Int>()
    for (i in score.indices) {
        if (honorList.size < k) {
            honorList.add(score[i])
        } else {
            if (honorList[0] < score[i]) {
                honorList[0] = score[i]
            }
        }
        honorList.sort()
        answer += honorList[0]
    }
    return answer
}
}