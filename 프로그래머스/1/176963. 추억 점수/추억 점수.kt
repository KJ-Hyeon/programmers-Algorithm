class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
    var answer: IntArray = intArrayOf()
    for (person in photo) {
        var score: Int = 0
        for (people in person) {
            if (name.contains(people)) {
                score += yearning[name.indexOf(people)]
            }
        }
        answer += score
    }
    return answer
}
}