class Foo(val x : String, var y: Int) {
    fun sayHello() = print("Hello")
}

fun main(args: Array<String>) : Unit {
    print("Hello world!")

    val foo = Foo("JUG ZG", 14)
    foo.sayHello()
}
