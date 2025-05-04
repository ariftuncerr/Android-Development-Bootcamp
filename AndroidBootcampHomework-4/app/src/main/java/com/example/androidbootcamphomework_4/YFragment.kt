package com.example.androidbootcamphomework_4

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.androidbootcamphomework_4.databinding.FragmentYBinding
import com.example.androidbootcamphomework_4.databinding.FragmentZBinding
import androidx.navigation.findNavController

class YFragment : Fragment() {
    private lateinit var binding : FragmentYBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentYBinding.inflate(inflater,container,false)
        val view : View = binding.root
        //disenable back
        val backButton = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                val actionBackMain = YFragmentDirections.actionYFragmentToMainFragment2()
                view.findNavController().navigate(actionBackMain)
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backButton)

        return binding.root
    }



}