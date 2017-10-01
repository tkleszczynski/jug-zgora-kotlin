class Foo(val x : String, var y: Int) {
    fun sayHello() = print("Hello ${x} ${y}")
}

fun main(args: Array<String>) : Unit {
    print("Hello world!")

    val foo = Foo("JDD", 2017)
    foo.sayHello()
}
