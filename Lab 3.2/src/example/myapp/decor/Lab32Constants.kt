package example.myapp.decor

// Top-level constant
const val ROCKS = 3

object Constants {
    const val CONSTANT2 = "object constant"
}

class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}

fun constantsDemo() {
    println("ROCKS = $ROCKS")
    println("From object = ${Constants.CONSTANT2}")
    println("From companion = ${MyClass.CONSTANT3}")
}