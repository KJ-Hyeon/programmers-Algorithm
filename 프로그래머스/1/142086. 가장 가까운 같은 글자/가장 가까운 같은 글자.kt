class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        val charList: MutableList<Char> = mutableListOf<Char>()
        
        s.forEach{
            if(charList.contains(it)){
                for(i in charList.size-1 downTo 0){
                    if(charList[i] == it){
                        answer += charList.size-i
                        charList.add(it)
                        break
                    }
                }
            } else {
                charList.add(it)
                answer += -1
            }
        }
        return answer
    }
}