fun main() {
    // Gọi từng phần của Lab
    println("=== Part 1: List & Set ===")
    partListAndSet()

    println("\n=== Part 2: Map ===")
    partMap()

    println("\n=== Part 3: Collection Processing ===")
    partCollectionProcessing()

    println("\n=== Part 4: Lambdas ===")
    partLambdas()

    println("\n=== Part 5: Word List ===")
    partWordList()
}

/* =======================
 *  Part 1 — LIST & SET
 * ======================= */
fun partListAndSet() {
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("list: $numbers")
    println("sorted: ${numbers.sorted()}")

    val setOfNumbers = numbers.toSet()
    println("set: $setOfNumbers")

    val set1 = setOf(1, 2, 3)
    val set2 = mutableSetOf(3, 2, 1)
    println("$set1 == $set2: ${set1 == set2}")

    println("contains 7: ${setOfNumbers.contains(7)}")
}

/* =======================
 *   Part 2 — MAP
 * ======================= */
fun partMap() {
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )

    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    peopleAges["Fred"] = 31

    println(peopleAges)
}

/* ==================================
 *   Part 3 — MAP + forEach + filter
 * ================================== */
fun partCollectionProcessing() {
    val peopleAges = mutableMapOf(
        "Fred" to 31,
        "Ann" to 23,
        "Barbara" to 42,
        "Joe" to 51
    )

    println(
        peopleAges
            .map { "${it.key} is ${it.value}" }
            .joinToString(", ")
    )

    val filteredNames = peopleAges.filter { it.key.length < 4 }
    println(filteredNames)
}

/* =======================
 *   Part 4 — Lambdas
 * ======================= */
fun partLambdas() {
    val triple: (Int) -> Int = { it * 3 }
    println(triple(5))

    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sorted())

    println(
        peopleNames.sortedWith { s1, s2 ->
            s1.length - s2.length
        }
    )
}

/* =======================
 *   Part 5 — WORD LIST
 * ======================= */
fun partWordList() {
    val words = listOf(
        "about", "acute", "awesome", "balloon", "best",
        "brief", "class", "coffee", "creative"
    )

    val filteredWords = words
        .filter { it.startsWith("c", ignoreCase = true) }
        .shuffled()
        .take(1)

    println(filteredWords)
}
