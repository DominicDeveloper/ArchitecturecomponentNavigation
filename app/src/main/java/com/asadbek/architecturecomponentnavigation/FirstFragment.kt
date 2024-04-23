package com.asadbek.architecturecomponentnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.asadbek.architecturecomponentnavigation.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    lateinit var binding: FragmentFirstBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)

        // animatsiya bitta oynadan boshqa oynaga o`tish mobaynida
        val navOption = NavOptions.Builder()
        navOption.setEnterAnim(R.anim.enter_anim)
        navOption.setExitAnim(R.anim.pop_exit_anim)
        navOption.setPopEnterAnim(R.anim.pop_enter_anim)
        navOption.setPopExitAnim(R.anim.pop_exit_anim)

        binding.btnNext.setOnClickListener {
            var ism = binding.edtName.text.toString().trim()


            // boshqa oynaga o`tish uchun
            findNavController().navigate(R.id.secondFragment, bundleOf("key" to ism),navOption.build())
        }

        return binding.root
    }


}