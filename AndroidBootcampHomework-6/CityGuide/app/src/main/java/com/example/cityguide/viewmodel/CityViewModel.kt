package com.example.cityguide.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cityguide.model.CityData
import com.example.cityguide.repository.CityRepository
import kotlinx.coroutines.launch

class CityViewModel : ViewModel() {

    private val repository = CityRepository()

    private val _cityList = MutableLiveData<List<CityData>>()
    val cityList: LiveData<List<CityData>> = _cityList

    private val _errorMessage = MutableLiveData<String?>()
    val errorMessage: LiveData<String?> = _errorMessage

    private val allCities = mutableListOf<CityData>()
    private var currentPage = 1
    private var totalPages = Int.MAX_VALUE // İlk veride güncellenir
    private var isLoading = false

    fun fetchInitialCities() {
        currentPage = 1
        allCities.clear()
        fetchCities(currentPage)
    }

    fun fetchCities(page: Int) {
        if (isLoading || page > totalPages) return

        isLoading = true
        viewModelScope.launch {
            try {
                Log.d("CityViewModel", "Veri çekiliyor - page: $page")
                val response = repository.getCities(page)

                if (response.isSuccessful) {
                    Log.d("CityViewModel", " Response başarılı")

                    response.body()?.let { data ->
                        Log.d("CityViewModel", "🌆 Gelen şehir sayısı: ${data.data.size}")
                        allCities.addAll(data.data)
                        _cityList.postValue(allCities)
                        currentPage++
                        totalPages = data.totalPage
                    }
                } else {
                    Log.e("CityViewModel", " Response başarısız: ${response.code()}")
                    _errorMessage.postValue("Veri alınamadı: ${response.code()}")
                }
            } catch (e: Exception) {
                Log.e("CityViewModel", " Hata oluştu: ${e.localizedMessage}")
                _errorMessage.postValue("Hata: ${e.localizedMessage}")
            } finally {
                isLoading = false
            }
        }
    }

}
