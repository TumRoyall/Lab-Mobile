package example.myapp.decor

fun collectionsDemo() {
    val list = listOf(1, 5, 3, 4)
    println("Sum of list = ${list.sum()}")

    val list2 = listOf("a", "bbb", "cc")
    println("Sum by length = ${list2.sumBy { it.length }}")

    for (s in list2.listIterator()) {
        print("$s ")
    }
    println()

    val scientific = hashMapOf(
        "guppy" to "poecilia reticulata",
        "catfish" to "corydoras",
        "zebra fish" to "danio rerio"
    )
    println(scientific["guppy"])
    println(scientific.getOrDefault("swordtail", "sorry, I don't know"))
    println(scientific.getOrElse("swordtail") { "dynamic default value" })
}