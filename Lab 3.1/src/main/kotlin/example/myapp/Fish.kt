package main.kotlin.example.myapp

// Behaviors & traits
interface FishAction { fun eat() }
interface FishColor { val color: String }


// Singleton color impl
object GoldColor : FishColor { override val color: String = "gold" }


// Reusable action impl
class PrintingFishAction(private val food: String) : FishAction {
    override fun eat() { println(food) }
}


// Plecostomus composed via delegation
class Plecostomus(
    fishColor: FishColor = GoldColor
) : FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor


// Shark composed via delegation as well
class Shark(
    private val food: String = "hunt and eat fish",
    private val sharkColor: FishColor = object : FishColor { override val color = "grey" }
) : FishAction by PrintingFishAction(food),
    FishColor by sharkColor