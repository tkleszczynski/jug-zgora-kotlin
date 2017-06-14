data class Account(val email: String, val externalId: String?)

fun main(args: Array<String>) {
    Account("t@est.com", "U-123").copy("foo")
}