class Solution {
    fun solution(num: Int): Int {
        var number = num.toLong()
        var count = 0
        while(count < 500 && number > 1) {
            number = if(number % 2 == 0L) number / 2 else number*3 + 1
            count++
        }
        if(count == 500) count = -1
        return count
    }
}