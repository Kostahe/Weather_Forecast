package com.example.weatherforecast.domain.repository

import com.example.weatherforecast.domain.models.Weather

interface WeatherRepository {
    suspend fun getWeatherData(latitude: Double, longitude: Double): State<Weather>
}