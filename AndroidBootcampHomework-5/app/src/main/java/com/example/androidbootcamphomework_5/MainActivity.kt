package com.example.androidbootcamphomework_5

import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidbootcamphomework_5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var editList = mutableListOf(0)
    private var resultText : String = "0"
    private lateinit var lastText : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        lastText = binding.editText.text.toString()

    }
    fun allButtonClick(view: View){
        val button = view as Button
        var text : String?
        when(button.text){
            "0"->{
                text = "0"
                binding.editText.setText(lastText+text)
                lastText = binding.editText.text.toString()
            }
            "1"->{
                text = "1"
                binding.editText.setText(lastText+text)
                lastText = binding.editText.text.toString()

            }
            "2"->{
                text = "2"
                binding.editText.setText(lastText+text)
                lastText = binding.editText.text.toString()

            }
            "3"->{
                text = "3"
                binding.editText.setText(lastText+text)
                lastText = binding.editText.text.toString()

            }
            "4"->{
                text = "4"
                binding.editText.setText(lastText+text)
                lastText = binding.editText.text.toString()

            }
            "5"->{
                text = "5"
                binding.editText.setText(lastText+text)
                lastText = binding.editText.text.toString()

            }
            "6"->{
                text = "6"
                binding.editText.setText(lastText+text)
                lastText = binding.editText.text.toString()

            }
            "7"->{
                text = "7"
                binding.editText.setText(lastText+text)
                lastText = binding.editText.text.toString()

            }
            "8"->{
                text = "8"
                binding.editText.setText(lastText+text)
                lastText = binding.editText.text.toString()

            }
            "9"->{
                text = "9"
                binding.editText.setText(lastText+text)
                lastText = binding.editText.text.toString()

            }

            "+"->{
                text = "+"
                binding.editText.setText(lastText+text)
                lastText = binding.editText.text.toString()

            }
            "-"->{
                text = "-"
                binding.editText.setText(lastText+text)
                lastText = binding.editText.text.toString()

            }
            "/"->{
                text = "/"
                binding.editText.setText(lastText+text)
                lastText = binding.editText.text.toString()

            }
            "*"->{
                text = "*"
                binding.editText.setText(lastText+text)
                lastText = binding.editText.text.toString()

            }
            "%"->{
                text = "%"
                binding.editText.setText(lastText+text)
                lastText = binding.editText.text.toString()

            }

            "C"->{
                lastText.dropLast(1)
                binding.editText.setText(lastText)

            }
            "AC"->{
                binding.editText.setText("")
                lastText = ""

            }
            "=" ->{
                calculate(lastText)
                lastText = ""

            }
        }


    }
    private fun calculate(string: String){
        var result : Double = 0.0
        var lastIndex = 0
        val tempString = string
        var number : String = ""
        var i = 0
        while(string.length != 0){
            if(string[i].toString().equals('+')){
                for(k in 0..i)
                    number += string[k]

            }

        }

    }

}