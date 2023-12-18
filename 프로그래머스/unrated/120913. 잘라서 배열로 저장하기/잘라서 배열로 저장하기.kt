class Solution {
    fun solution(my_str: String, n: Int): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        for(i in my_str.indices step n) {
            if(my_str.length >=  i + n) answer += my_str.substring(i until n+i)
            else answer += my_str.substring(i)
        }
        return answer
    }
}
// chunked : 개수를 기준으로 문자열을 자르는 함수. 리턴값도 List
// my_str.chunked(n).toTypedArray()