package com.example.cityguide.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cityguide.databinding.ItemCityRowBinding
import com.example.cityguide.model.CityData

class CityAdapter : RecyclerView.Adapter<CityAdapter.CityViewHolder>() {

    private var cityList = listOf<CityData>()
    private val expandedPositions = mutableSetOf<Int>()

    fun submitList(newList: List<CityData>) {
        cityList = newList
        notifyDataSetChanged()
    }

    inner class CityViewHolder(val binding: ItemCityRowBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val binding = ItemCityRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CityViewHolder(binding)
    }

    override fun getItemCount(): Int = cityList.size

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        val city = cityList[position]
        val isExpanded = expandedPositions.contains(position)

        holder.binding.cityNameText.text = city.city
        holder.binding.btnExpand.setImageResource(
            if (isExpanded) android.R.drawable.arrow_up_float else android.R.drawable.arrow_down_float
        )

        holder.binding.btnExpand.setOnClickListener {
            if (isExpanded) expandedPositions.remove(position) else expandedPositions.add(position)
            notifyItemChanged(position)
        }

        if (isExpanded) {
            holder.binding.locationRecyclerView.visibility = View.VISIBLE
            holder.binding.locationRecyclerView.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = LocationAdapter(city.locations)
            }
        } else {
            holder.binding.locationRecyclerView.visibility = View.GONE
        }
    }
}
