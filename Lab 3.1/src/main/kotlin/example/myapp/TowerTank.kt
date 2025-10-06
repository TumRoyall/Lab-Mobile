package main.kotlin.example.myapp

import java.lang.Math.PI


class TowerTank(
    override var height: Int,
    var diameter: Int
) : Aquarium(height = height, width = diameter, length = diameter) {


    // Cylinder volume ≈ π * r1 * r2 * h
    override var volume: Int
        get() = ((width / 2.0) * (length / 2.0) * height / 1000.0 * PI).toInt()
        set(value) {
            height = ((value * 1000.0 / PI) / ((width / 2.0) * (length / 2.0))).toInt()
        }


    override var water: Double = volume * 0.8
    override val shape: String = "cylinder"
}