package com.example.weatherforecast.data.api.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Hourly(
    @Json(name = "precipitation_probability")
    val precipitationProbability: List<Int>,
    @Json(name = "relativehumidity_2m")
    val relativehumidity2m: List<Int>,
    @Json(name = "temperature_2m")
    val temperature2m: List<Double>,
    @Json(name = "time")
    val time: List<Int>,
    @Json(name = "weathercode")
    val weathercode: List<Int>,
    @Json(name = "windspeed_10m")
    val windspeed10m: List<Double>
)