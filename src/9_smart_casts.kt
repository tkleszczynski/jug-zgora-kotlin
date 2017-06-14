fun smartFun(arg: Any) {
    when (arg) {
        is Int -> print(arg + 1)
        is String -> print(arg.length + 1)
        is IntArray -> print(arg.sum())
    }
}

fun smartCasts(arg: Any?) {
    if (arg !is String) return
    println("$arg is String and its length is ${arg.length}")

    if (arg is CharSequence && arg.length > 4) {
        println(arg.length)
    }
}

fun main(args: Array<String>) {

    smartFun(1)
    smartFun("JUG Zielona Góra")
    smartFun(intArrayOf(1, 2, 3, 4, 5))

    val x : Int? = null
    val y = if (x != null) {
        x + 4
    } else {
        0
    }
}