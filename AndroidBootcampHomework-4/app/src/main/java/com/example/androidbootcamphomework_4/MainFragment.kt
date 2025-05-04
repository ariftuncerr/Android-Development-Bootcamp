package com.example.androidbootcamphomework_4

import android.os.Bundle
import android.text.Layout.Directions
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.androidbootcamphomework_4.databinding.FragmentMainBinding
import androidx.navigation.findNavController

class MainFragment : Fragment() {


    private lateinit var binding : FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater,container,false)
        val view = binding.root

        val actionA = MainFragmentDirections.actionMainFragment2ToAFragment()
        val actionX = MainFragmentDirections.actionMainFragment2ToXFragment()

        binding.btnGoToA.setOnClickListener{
            Navigation.findNavController(view).navigate(actionA)

        }

        binding.btnGoToX.setOnClickListener{
            view.findNavController().navigate(actionX)
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