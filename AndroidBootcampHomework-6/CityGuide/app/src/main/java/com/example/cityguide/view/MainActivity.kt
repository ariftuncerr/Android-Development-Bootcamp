package com.example.cityguide.view

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cityguide.adapter.CityAdapter
import com.example.cityguide.databinding.ActivityMainBinding
import com.example.cityguide.viewmodel.CityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: CityViewModel by viewModels()
    private lateinit var cityAdapter: CityAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
        observeData()
        setupPagination()
    }

    private fun setupRecyclerView() {
        cityAdapter = CityAdapter()
        binding.recyclerViewCities.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = cityAdapter
        }
    }

    private fun observeData() {
        viewModel.cityList.observe(this) { cities ->
            cityAdapter.submitList(cities)
        }

        viewModel.errorMessage.observe(this) { error ->
            error?.let {
                Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setupPagination() {
        binding.recyclerViewCities.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                val layoutManager = recyclerView.layoutManager as LinearLayoutManager
                val lastVisible = layoutManager.findLastVisibleItemPosition()
                val itemCount = layoutManager.itemCount
                if (lastVisible >= itemCount - 3) {
                    viewModel.fetchCities(itemCount / 20 + 1)
                }
            }
        })
    }
}
