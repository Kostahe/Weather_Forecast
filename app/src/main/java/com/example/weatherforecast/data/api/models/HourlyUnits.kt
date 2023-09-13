package com.example.weatherforecast.data.api.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class HourlyUnits(
    @Json(name = "precipitation_probability")
    val precipitationProbability: String,
    @Json(name = "relativehumidity_2m")
    val relativeHumidity: String,
    @Json(name = "temperature_2m")
    val temperature: String,
    @Json(name = "time")
    val time: String,
    @Json(name = "weathercode")
    val weatherCode: String,
    @Json(name = "windspeed_10m")
    val windSpeed: String
)