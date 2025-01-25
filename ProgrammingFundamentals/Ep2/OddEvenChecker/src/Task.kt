import com.faangx.ktp.basics.OddEvenCheckerMiniApp

fun checkEvenOdd(num: Int): String {
    if (num / 2 == 0) {
        return "even"
    } else {
        return "odd"
    }
}

fun main() {
    OddEvenCheckerMiniApp(::checkEvenOdd)
}