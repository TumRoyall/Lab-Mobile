package example.myapp.decor

open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

// Extension function
fun String.hasSpaces() = indexOf(" ") != -1

// Extension function with override
fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

// Extension property
val AquariumPlant.isGreen: Boolean
    get() = color == "green"

// Nullable receiver
fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}

fun extensionsDemo() {
    val s = "Hello World"
    println("Has spaces: ${s.hasSpaces()}")

    val plant = GreenLeafyPlant(10)
    plant.print()

    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()

    println("Is green? ${aquariumPlant.isGreen}")

    val nullablePlant: AquariumPlant? = null
    nullablePlant.pull()
}