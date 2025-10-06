package example.myapp.decor

fun main() {
    println("=== Companion Object Demo ===")
    println(Choice.name)
    Choice.showDescription("pick")
    Choice.showDescription("selection")

    println("\n=== Pairs & Triples Demo ===")
    pairsAndTriplesDemo()

    println("\n=== Collections Demo ===")
    collectionsDemo()

    println("\n=== Constants Demo ===")
    constantsDemo()

    println("\n=== Extensions Demo ===")
    extensionsDemo()
}