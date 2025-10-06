package example.myapp.decor

fun pairsAndTriplesDemo() {
    // Pair
    val equipment = "fish net" to "catching fish"
    println("${equipment.first} used for ${equipment.second}")

    // Destructure Pair
    val (tool, use) = equipment
    println("$tool is used for $use")

    // Triple
    val numbers = Triple(6, 9, 42)
    println(numbers.toString())
    println(numbers.toList())

    // Destructure Triple
    val (n1, n2, n3) = numbers
    println("$n1 $n2 $n3")

    // Nested Pair
    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}")
    println("${equipment2.first.second}")
}
