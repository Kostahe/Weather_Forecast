package com.example.weatherforecast.data.api.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DailyUnits(
    @Json(name = "temperature_2m_max")
    val temperatureMax: String,
    @Json(name = "temperature_2m_min")
    val temperatureMin: String,
    @Json(name = "time")
    val time: String,
    @Json(name = "weathercode")
    val weatherCode: String
)