fun getScore(score: Int) = when (score) {
    9, 10 -> "Excellent"
    in 6..8 -> "Good"
    4, 5 -> "Ok"
    in 1..3 -> "Fail"
    else -> "Fail"
}

fun whenShowcase(x : Any?) {
    val validNumbers = listOf(21, 22, 23)

    val result = when (x) {
        0, 1 -> "x == 0 or x == 1"
        is String -> x.startsWith("prefix")
        in 1..10 -> "x is in the range"
        in validNumbers -> "x is valid"
        !in 10..20 -> {
            "x is outside the range"
        }
        else -> "Else branch"
    }
    print(result)
}

fun main(args: Array<String>) {
    whenShowcase(1L)
}