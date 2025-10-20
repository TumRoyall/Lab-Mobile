package com.example.lemonade

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var lemonadeState = SELECT
    private var squeezeCount = 0
    private var requiredSqueezeCount = (1..10).random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lemonImage: ImageView = findViewById(R.id.imageViewCur)
        lemonImage.setOnClickListener { clickLemonImage() }

        setViewElements()
    }

    private fun clickLemonImage() {
        when (lemonadeState) {
            SELECT -> {
                lemonadeState = SQUEEZE
                squeezeCount = 0
                requiredSqueezeCount = (1..10).random()
            }
            SQUEEZE -> {
                squeezeCount++
                if (squeezeCount >= requiredSqueezeCount) {
                    lemonadeState = DRINK
                }
            }
            DRINK -> lemonadeState = RESTART
            RESTART -> lemonadeState = SELECT
        }
        setViewElements()
    }

    private fun setViewElements() {
        val textAction: TextView = findViewById(R.id.textViewCur)
        val lemonImage: ImageView = findViewById(R.id.imageViewCur)

        when (lemonadeState) {
            SELECT -> {
                textAction.setText(R.string.lemon_select)
                lemonImage.setImageResource(R.drawable.lemon_tree)
            }
            SQUEEZE -> {
                textAction.setText(R.string.lemon_squeeze)
                lemonImage.setImageResource(R.drawable.lemon_squeeze)
            }
            DRINK -> {
                textAction.setText(R.string.lemon_drink)
                lemonImage.setImageResource(R.drawable.lemon_drink)
            }
            RESTART -> {
                textAction.setText(R.string.lemon_restart)
                lemonImage.setImageResource(R.drawable.lemon_restart)
            }
        }
    }

    companion object {
        private const val SELECT = "SELECT"
        private const val SQUEEZE = "SQUEEZE"
        private const val DRINK = "DRINK"
        private const val RESTART = "RESTART"
    }
}
