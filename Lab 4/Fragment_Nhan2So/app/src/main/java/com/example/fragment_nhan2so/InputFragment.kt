package com.example.fragment_nhan2so

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class InputFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_input, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val number1: EditText = view.findViewById(R.id.number1)
        val number2: EditText = view.findViewById(R.id.number2)
        val button: Button = view.findViewById(R.id.bt_multiply)

        button.setOnClickListener {
            val n1 = number1.text.toString().toFloatOrNull() ?: 0f
            val n2 = number2.text.toString().toFloatOrNull() ?: 0f

            val action =
                InputFragmentDirections.actionInputFragmentToMultiplyFragment(n1, n2)

            view.findNavController().navigate(action)
        }
    }
}
