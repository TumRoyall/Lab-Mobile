package main.kotlin.example.myapp

open class Aquarium(
    open var length: Int = 100,
    open var width: Int = 20,
    open var height: Int = 40
) {
    init { println("aquarium initializing") }


    open val shape: String = "rectangle"


    open var volume: Int
        get() = width * height * length / 1000 // 1000 cm^3 = 1 liter
        set(value) {
            height = (value * 1000) / (width * length)
        }


    // ~90% volume is usable water
    open var water: Double = 0.0
        get() = volume * 0.9


    // Secondary constructor: compute height from number of fish
    constructor(numberOfFish: Int) : this() {
// 2,000 cm^3 per fish + 10% headroom
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }


    fun printSize() {
        println(shape)
        println("Width: $width cm Length: $length cm Height: $height cm")
        println("Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)")
    }
}