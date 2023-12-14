class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        val answer = strArr.mapIndexed{index, s ->
            if(index % 2 == 0) s.toLowerCase() else s.toUpperCase()
        }.toTypedArray()
        return answer
    }
}