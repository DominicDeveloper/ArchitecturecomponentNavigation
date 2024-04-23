package com.asadbek.architecturecomponentnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.asadbek.architecturecomponentnavigation.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)

        var malumot = arguments?.getString("key")

        binding.myTextView.text = malumot

        binding.btnFinish.setOnClickListener {
            findNavController().navigate(R.id.finishFragment)
        }


        return binding.root
    }

}