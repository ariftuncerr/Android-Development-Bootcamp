package com.example.cityguide.repository

import com.example.cityguide.model.CityResponse
import com.example.cityguide.service.CityClient
import retrofit2.Response

class CityRepository {
    suspend fun getCities(page: Int): Response<CityResponse> {
        return CityClient.apiService.getCitiesByPage(page)
    }
}