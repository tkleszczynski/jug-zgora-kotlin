fun main(args: Array<String>) {

    val list = ArrayList<String>() // non-null (constructor result)
    list.add("Item")
    val size = list.size // non-null (primitive int)
    val item = list[0] // platform type inferred (ordinary Java object)

    item.substring(1) // allowed, may throw an exception if item == null
    val nullable: String? = item // allowed, always works
    val notNull: String = item // allowed, may fail at runtime
}