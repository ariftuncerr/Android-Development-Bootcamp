package com.example.androidbootcamphomework_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.androidbootcamphomework_4.databinding.FragmentZBinding

class XFragment : Fragment() {
    private lateinit var binding : FragmentZBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentZBinding.inflate(inflater,container,false)

        binding.btnGoToY2.setOnClickListener{
            val actionY = XFragmentDirections.actionXFragmentToYFragment()
            Navigation.findNavController(it).navigate(actionY)
        }

        //disenable back
        val backButton = object : OnBackPressedCallback (true){
            override fun handleOnBackPressed() {
                isEnabled = false
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backButton)

        return binding.root
    }


}