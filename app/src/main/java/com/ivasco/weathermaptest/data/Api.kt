package com.ivasco.weathermaptest.data

import com.ivasco.weathermaptest.model.WeatherData
import retrofit2.http.*

interface Api {
    //http://api.openweathermap.org/data/2.5/weather?q=sorocaba,br&units=metric&APPID=valordotokendasuaapi
    @GET("weather?units=metric&APPID=0367c18096ac1d6da1f9e5153f0da2df")
    suspend fun getWeatherData(@Query("q") city: String): WeatherData

    companion object {
        val api: Api by lazy {
            RetrofitFactory.build()
                .create(Api::class.java)
        }
    }
}