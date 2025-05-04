package com.example.androidbootcamphomework_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.findNavController
import com.example.androidbootcamphomework_4.databinding.FragmentABinding
import com.example.androidbootcamphomework_4.databinding.FragmentBBinding


class BFragment : Fragment() {

    private lateinit var binding : FragmentBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBBinding.inflate(inflater,container,false)
        val view : View = binding.root

        binding.btnGoToY.setOnClickListener{
            val actionY = BFragmentDirections.actionBFragmentToYFragment()
            view.findNavController().navigate(actionY)
        }
        //disenable back
        val backButton = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                isEnabled = false
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backButton)
        return view
    }

}