package com.example.weatherforecast.domain.models

data class CurrentWeather(
    val temperature: Double,
    val time: String,
    val day: String,
    val weatherStatus: WeatherStatus,
    val windSpeed: Double
)
