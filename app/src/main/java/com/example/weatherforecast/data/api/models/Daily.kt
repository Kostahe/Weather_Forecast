package com.example.weatherforecast.data.api.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Daily(
    @Json(name = "temperature_2m_max")
    val temperature2mMax: List<Double>,
    @Json(name = "temperature_2m_min")
    val temperature2mMin: List<Double>,
    @Json(name = "time")
    val time: List<Int>,
    @Json(name = "weathercode")
    val weathercode: List<Int>
)