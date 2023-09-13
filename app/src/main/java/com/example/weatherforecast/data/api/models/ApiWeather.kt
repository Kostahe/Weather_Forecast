package com.example.weatherforecast.data.api.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiWeather(
    @Json(name = "current_weather")
    val currentWeather: ApiCurrentWeather,
    @Json(name = "daily")
    val daily: ApiDaily,
    @Json(name = "daily_units")
    val apiDailyUnits: ApiDailyUnits,
    @Json(name = "elevation")
    val elevation: Double,
    @Json(name = "generationtime_ms")
    val generationTimeMs: Double,
    @Json(name = "hourly")
    val hourly: ApiHourly,
    @Json(name = "hourly_units")
    val apiHourlyUnits: ApiHourlyUnits,
    @Json(name = "latitude")
    val latitude: Double,
    @Json(name = "longitude")
    val longitude: Double,
    @Json(name = "timezone")
    val timezone: String,
    @Json(name = "timezone_abbreviation")
    val timezoneAbbreviation: String,
    @Json(name = "utc_offset_seconds")
    val utcOffsetSeconds: Int
)