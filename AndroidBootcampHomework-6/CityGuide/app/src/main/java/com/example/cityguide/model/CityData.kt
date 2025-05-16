package com.example.cityguide.model

import java.io.Serializable

data class CityData(
    val city: String,
    val locations: List<LocationItem>
) : Serializable