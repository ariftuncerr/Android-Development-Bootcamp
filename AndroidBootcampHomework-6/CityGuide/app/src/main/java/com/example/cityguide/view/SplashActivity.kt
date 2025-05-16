package com.example.cityguide.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.cityguide.databinding.ActivitySplashBinding
import com.example.cityguide.viewmodel.CityViewModel

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding
    private val viewModel: CityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)


        observeData()
        viewModel.fetchInitialCities()
    }

    private fun observeData() {
        viewModel.cityList.observe(this) { cities ->
            if (cities.isNotEmpty()) {
                startActivity(Intent(this, MainActivity::class.java))
                finish() // Splash ekranından çık
            }
        }

        viewModel.errorMessage.observe(this) { error ->
            error?.let {
                Toast.makeText(this, it, Toast.LENGTH_LONG).show()
            }
        }
    }
}
