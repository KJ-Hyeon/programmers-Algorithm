class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        for(i in 0 until commands.size) {
            var sliceArray = array.slice(commands[i][0]-1..commands[i][1]-1)
            sliceArray = sliceArray.sorted()
            answer += sliceArray[commands[i][2]-1]
        }
        return answer
    }
}