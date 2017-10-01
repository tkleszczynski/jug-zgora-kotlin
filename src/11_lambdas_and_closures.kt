fun up(arg: String): String = arg.toUpperCase()

fun main(args: Array<String>) {
    val countries = listOf("Poland", "Germany", "France", "Italy")

    val toUpperCase: (String) -> String = ::up

    println(countries.map { element: String -> up(element) })

    println(countries.map { toUpperCase.invoke(it) })

    println(countries.map(toUpperCase))

    println(countries.map { toUpperCase })

    // closures
    var count = 0
    countries.forEach { count += it.length }
    println(count)

    countries.map { print("$it "); if (it == "Germany") return  }

    countries.map mapping@ { print(it); if (it == "Germany") return@mapping }
    countries.map { print(it); if (it == "Germany") return@map  }
}