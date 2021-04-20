import kotlin.concurrent.timer


fun main() {

    // 타이머 연습
    val RUNNING_TIME = 25
    val SHORT_REST_TIME = 5
    val LONG_REST_TIME = 15

    var nowMin = 0
    var nowSecond = 0

    nowMin = RUNNING_TIME

    timer (period = 1000, initialDelay = 1000)
    {
        print(String.format("\n%02d : %02d", nowMin, nowSecond))

        if (nowSecond==0 && nowMin==0)
        {
            println("\n타이머 종료")
            cancel()
        }
        if (nowSecond == 0)
        {
            nowMin--
            nowSecond = 60
        }
        nowSecond--
    }
}