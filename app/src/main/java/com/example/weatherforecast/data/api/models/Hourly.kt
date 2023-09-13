package com.example.weatherforecast.data.api.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Hourly(
    @Json(name = "precipitation_probability")
    val precipitationProbability: List<Int>,
    @Json(name = "relativehumidity_2m")
    val relativeHumidity: List<Int>,
    @Json(name = "temperature_2m")
    val temperature: List<Double>,
    @Json(name = "time")
    val time: List<Int>,
    @Json(name = "weathercode")
    val weatherCode: List<Int>,
    @Json(name = "windspeed_10m")
    val windSpeed: List<Double>
)