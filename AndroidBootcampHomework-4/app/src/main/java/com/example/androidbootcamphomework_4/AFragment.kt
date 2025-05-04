package com.example.androidbootcamphomework_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.androidbootcamphomework_4.databinding.FragmentABinding
import androidx.navigation.findNavController

class AFragment : Fragment() {

    private lateinit var binding : FragmentABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater,container,false)

        binding.btnGoToB.setOnClickListener{
            val actionB = AFragmentDirections.actionAFragmentToBFragment()
            it.findNavController().navigate(actionB)

        }
        //disenable back
        val backButton = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                isEnabled = false
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backButton)

        return binding.root
    }
}