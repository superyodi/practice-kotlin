package leetcode_interview


// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/
class ReverseInteger {

    fun reverse(x: Int): Int {
        var x = x
        var rev = 0
        while (x != 0) {
            val pop = x % 10
            x /= 10
            if (rev > Int.MAX_VALUE / 10 || rev == Int.MAX_VALUE / 10 && pop > 7) return 0
            if (rev < Int.MIN_VALUE / 10 || rev == Int.MIN_VALUE / 10 && pop < -8) return 0
            rev = rev * 10 + pop
        }
        return rev

    }
}

fun main() {

    val reverseInteger = ReverseInteger()
    print(reverseInteger.reverse(123))
}


