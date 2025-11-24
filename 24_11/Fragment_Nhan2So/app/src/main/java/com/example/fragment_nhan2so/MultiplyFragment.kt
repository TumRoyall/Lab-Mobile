package com.example.fragment_nhan2so

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class MultiplyFragment : Fragment() {

    private val args: MultiplyFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_multiply, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val output: TextView = view.findViewById(R.id.mf_multiply)

        val n1 = args.number1
        val n2 = args.number2
        val result = n1 * n2

        output.text = "$n1 × $n2 = $result"
    }
}
