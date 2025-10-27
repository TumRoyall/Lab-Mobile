package com.example.tiptime

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tiptime.databinding.ActivityMainBinding
import java.text.NumberFormat


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener { calculateTip() }
    }

    @SuppressLint("StringFormatInvalid")
    private fun calculateTip() {
        val stringInTextField = binding.InputCost.text.toString()
        val cost = stringInTextField.toDoubleOrNull()
        if (cost == null) {
            binding.textView2.text = ""
            return
        }

        val tipPercentage = when (binding.tipOptions.checkedRadioButtonId) {
            R.id.option_amazing -> 0.20
            R.id.option_good -> 0.18
            else -> 0.15
        }

        var tip = tipPercentage * cost
        if (binding.switch1.isChecked) {
            tip = kotlin.math.ceil(tip)
        }

        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.textView2.text = getString(R.string.tip_amount, formattedTip)
    }

}
