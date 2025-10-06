package main.kotlin.example.myapp.decor

data class Decoration(val rocks: String)


data class Decoration2(val rocks: String, val wood: String, val diver: String)


// Enums
enum class Color(val rgb: Int) { RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF) }


enum class Direction(val degrees: Int) { NORTH(0), SOUTH(180), EAST(90), WEST(270) }