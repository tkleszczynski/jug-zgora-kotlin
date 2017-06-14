fun main(args: Array<String>) {

    val name = "JUG Zielona Góra!"
    val message = "Hello: $name"
    print(message)

    val s = "abc"
    print("String length is ${if (args.isNotEmpty()) args[0].length else s.length}")
}
