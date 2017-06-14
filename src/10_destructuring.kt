import java.io.File

fun main(args: Array<String>) {

    // destructuring objects
    val sample = Account("t@est.com", "L-123")
    val (email, externalId) = sample
    println("$email $externalId")

    // componentN convention
    val email1 = sample.component1()
    val externalId1 = sample.component2()

    // destructuring in for
    val list = listOf(sample, sample.copy("f@est.com"))
    for ((e, id) in list) {
        println("$e $id")
    }

    // unused parameters
    val (result, _) = compute()

    val br = File("test").bufferedReader()
    val line : String? = null
    val length = line?.length ?: -1
}

fun compute() : Result {
    return Result(0, true)
}
data class Result(val result: Int, val status : Boolean)