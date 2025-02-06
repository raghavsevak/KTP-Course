import com.faangx.ktp.patterns.single.PatternLinesAndTwoCharsBasedMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {
    repeat(lines) {i ->
        repeat(lines) {j ->
            if (i+j ==lines - 1) {
                print("*")
            } else {
                print("-")
            }
        }
        println()
    }
}

fun main() {
    PatternLinesAndTwoCharsBasedMiniApp("P2", ::printPattern)
}