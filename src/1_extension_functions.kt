import java.io.File
import java.math.BigDecimal

fun Int.toBigDecimal() = BigDecimal.valueOf(this.toLong())

val Int.bd : BigDecimal
    get() = BigDecimal.valueOf(this.toLong())


fun String.reverse() = StringBuilder(this).reverse().toString()

fun main(args: Array<String>) {
    print(1.bd + 2.toBigDecimal())

    print("String to reverse".reverse())

    val lines = File("test").bufferedReader().lines()
    print(lines)
}
