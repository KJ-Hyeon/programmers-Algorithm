class Solution {
    fun solution(phoneNumber: String): String {
        var answer = ""
        for (i in phoneNumber.indices) {
            if (i < phoneNumber.length - 4) answer += "*"  
            else answer += phoneNumber[i]  
        }
        return answer
    }
}