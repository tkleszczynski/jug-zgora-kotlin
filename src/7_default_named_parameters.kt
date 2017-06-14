@JvmOverloads
fun List<Any?>.join(separator: String = ", ", prefix: String = "[", postfix: String = "]"): String {
    val sb = StringBuilder()
    sb.append(prefix)
    for ((idx, e) in this.withIndex()) {
        sb.append(e)
        if (idx != this.lastIndex) {
            sb.append(separator)
        }
    }
    sb.append(postfix)
    return sb.toString()
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(list.join("|", ">", "<"))
    println(list.join(prefix = ">", postfix = "<"))
    println(list.join())
}