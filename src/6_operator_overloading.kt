fun main(args: Array<String>) {

    // + on BigDecimal
    print(123.bd + 234.bd)

    // []
    val list = arrayOf(1, 2, 3)
    list[0] = list[2]

    // in, !in
    println(4 !in list)
    println('f' in 'a'..'z')

    // invoke
    val f = { a: Int, b: Int -> a + b }
    println(f.invoke(2,3))
    val f1 = f
    println(f1(2,3))

    // ==, ===
    val account1 = Account("test", "foo")
    val account2 = Account("test", "foo")
    println(account1 == account2)
    println(account1 === account2)

    // comparison
    println("1" > "2")
}
