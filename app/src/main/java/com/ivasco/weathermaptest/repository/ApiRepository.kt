package com.ivasco.weathermaptest.repository

import com.ivasco.weathermaptest.data.Api
import com.ivasco.weathermaptest.model.WeatherData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class ApiRepository(private val api: Api = Api.api) {
    fun getData(city: String): Flow<WeatherData> = flow {
        emit(Api.api.getWeatherData(city))
    }.flowOn(Dispatchers.IO)

    companion object {
        val instance: ApiRepository by lazy { ApiRepository() }
    }
}