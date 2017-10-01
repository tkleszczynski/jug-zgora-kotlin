fun main(args: Array<String>) {

    // Non null type
    var a: String = "abc"
    //a = null // compilation error

    // Nullable type
    var b: String? = "abc"
    b = null // ok

    // Safe calls
    val l = if (b != null) b.length else -1
    b?.length

    // Elvis operator
    val account : Account? = Account("email", null)
    print(account?.externalId ?: "Not a number")

    // The !! operator
    b!!.length

    // Safe casts - return null if cast was not successful
    val aInt: Int? = a as? Int
}
