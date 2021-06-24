package leetcode_interview


// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/

class ReverseString {
    fun reverseString(s: CharArray): Unit {

        var f = 0
        var t = s.size-1
        var tmp: Char = 'a'

        while(f < t) {

            tmp = s[f]
            s[f] = s[t]
            s[t] = tmp

            f += 1
            t -= 1
        }
    }
}