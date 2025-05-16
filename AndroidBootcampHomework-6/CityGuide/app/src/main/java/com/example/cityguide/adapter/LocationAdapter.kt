package com.example.cityguide.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cityguide.databinding.ItemLocationRowBinding
import com.example.cityguide.model.LocationItem

class LocationAdapter(private val locationList: List<LocationItem>) : RecyclerView.Adapter<LocationAdapter.LocationViewHolder>() {

    inner class LocationViewHolder(val binding: ItemLocationRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationViewHolder {
        val binding = ItemLocationRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LocationViewHolder(binding)
    }

    override fun getItemCount(): Int = locationList.size

    override fun onBindViewHolder(holder: LocationViewHolder, position: Int) {
        val item = locationList[position]
        holder.binding.txtLocationName.text = item.name
    }
}
