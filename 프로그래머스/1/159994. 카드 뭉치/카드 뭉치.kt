class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var index1 = 0 
        var index2 = 0
        var answer: String = "Yes"
        goal.forEach{
            if(index1 < cards1.size && cards1[index1] == it) index1++
            else if (index2 < cards2.size && cards2[index2] == it) index2++
            else answer="No"
        }
        return answer
    }
}