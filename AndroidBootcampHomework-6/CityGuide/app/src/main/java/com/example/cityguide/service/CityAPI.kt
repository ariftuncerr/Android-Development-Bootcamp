package com.example.cityguide.service

import com.example.cityguide.model.CityResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CityAPI {
    @GET("page-{page}.json")
    suspend fun getCitiesByPage(@Path("page") page: Int): Response<CityResponse>


}