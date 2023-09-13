package com.example.weatherforecast.data.api

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET(ApiConstants.END_POINT)
    suspend fun getWeatherData(
        @Query(ApiParameters.LATITUDE) latitude: Double,
        @Query(ApiParameters.LONGITUDE) longitude: Double
    )
}