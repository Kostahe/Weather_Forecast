package com.example.weatherforecast.domain.models

data class CurrentWeather(
    val isDay: Boolean,
    val temperature: Double,
    val time: String,
    val day: String,
    val weatherStatus: WeatherStatus,
    val windDirection: String,
    val windSpeed: Double
)
