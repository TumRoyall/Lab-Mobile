package com.example.diceroller

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var numDice_1 = 0
    private var numDice_2 = 0
    private var numDice_3 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollbutton)
        val textDice: TextView = findViewById(R.id.textView)

        rollButton.setOnClickListener {
            rollDice()
            val sum = numDice_1 + numDice_2 + numDice_3
            textDice.text = "$sum"
            rollButton.text = getString(R.string.reroll) // dùng resource
        }
    }

    private fun rollDice() {
        val diceImage1: ImageView = findViewById(R.id.diceImage1)
        val diceImage2: ImageView = findViewById(R.id.diceImage2)
        val diceImage3: ImageView = findViewById(R.id.diceImage3)

        numDice_1 = Dice().roll()
        diceImage1.setImageResource(getDiceDrawable(numDice_1))

        numDice_2 = Dice().roll()
        diceImage2.setImageResource(getDiceDrawable(numDice_2))

        numDice_3 = Dice().roll()
        diceImage3.setImageResource(getDiceDrawable(numDice_3))
    }

    private fun getDiceDrawable(diceRoll: Int): Int = when (diceRoll) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
}

class Dice(private val numSides: Int = 6) {
    fun roll(): Int = (1..numSides).random()
}
