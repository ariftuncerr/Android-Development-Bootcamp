package com.example.cityguide.model

import android.os.Parcelable
import java.io.Serializable

data class CityResponse (
    val currentPage: Int,
    val totalPage: Int,
    val total: Int,
    val itemPerPage: Int,
    val pageSize: Int,
    val data: List<CityData>
) : Serializable