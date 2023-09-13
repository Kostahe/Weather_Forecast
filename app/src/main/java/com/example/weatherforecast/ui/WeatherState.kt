package com.example.weatherforecast.ui

import com.example.weatherforecast.domain.models.Weather
import com.example.weatherforecast.domain.repository.State

data class WeatherState(
    val weather: State<Weather> = State.Loading()
)
