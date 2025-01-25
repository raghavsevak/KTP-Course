import com.faangx.ktp.basics.StageOfLifeMiniApp

fun stageOfLife(age: Int): String {
    return when {
        age >= 60 -> "old age"
        age >= 18 -> "adulthood"
        age >= 12 -> "teenage"
        age >= 3 -> "childhood"
        else -> "infancy"
    }
}

fun main() {
    StageOfLifeMiniApp(::stageOfLife)
}