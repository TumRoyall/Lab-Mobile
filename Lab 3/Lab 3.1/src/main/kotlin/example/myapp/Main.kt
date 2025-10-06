package example.myapp
import main.kotlin.example.myapp.decor.*
import main.kotlin.example.myapp.*


fun buildAquarium() {
    val aquarium1 = Aquarium()
    aquarium1.printSize()


    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()


    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()


    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()


    val aquarium5 = Aquarium(numberOfFish = 29)
    aquarium5.printSize()
    aquarium5.volume = 70
    aquarium5.printSize()


    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}


fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()


    println("Shark: ${shark.color}")
    shark.eat()


    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}


fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)


    val decoration2 = Decoration("slate")
    println(decoration2)
    val decoration3 = Decoration("slate")
    println(decoration3)


    println(decoration1.equals(decoration2))
    println(decoration2.equals(decoration3))


    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)
    val (rock, _, diver) = d5 // destructuring with skip
    println(rock)
    println(diver)


// Enum demo
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}


fun main() {
    buildAquarium()
    makeFish()
    makeDecorations()
}