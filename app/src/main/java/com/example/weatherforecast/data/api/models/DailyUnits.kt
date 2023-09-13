package com.example.weatherforecast.data.api.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DailyUnits(
    @Json(name = "temperature_2m_max")
    val temperature2mMax: String,
    @Json(name = "temperature_2m_min")
    val temperature2mMin: String,
    @Json(name = "time")
    val time: String,
    @Json(name = "weathercode")
    val weathercode: String
)