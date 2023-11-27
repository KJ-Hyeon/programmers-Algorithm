class Solution {
    fun solution(age: Int): Int {
        var birthYear = 0
        if(age>0 && age <=120) {
            birthYear = 2022 - age + 1
        }
        return birthYear
    }
}