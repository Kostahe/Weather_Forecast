package com.example.weatherforecast.data.api.mappers

import com.example.weatherforecast.data.api.models.ApiCurrentWeather
import com.example.weatherforecast.domain.models.CurrentWeather
import com.example.weatherforecast.domain.models.WeatherStatus
import com.example.weatherforecast.utils.Util
import javax.inject.Inject

class ApiCurrentWeatherMapper @Inject constructor(): ApiMapper<CurrentWeather, ApiCurrentWeather>{
    override fun mapToDomain(apiEntity: ApiCurrentWeather): CurrentWeather {
        return CurrentWeather(
            isDay = apiEntity.isDay != 0,
            temperature = apiEntity.temperature,
            time = parseTime(apiEntity.time),
            day = parseDay(apiEntity.time),
            weatherStatus = parseWeatherStatus(apiEntity.weatherCode),
            windDirection = parseWindDirection(apiEntity.windDirection),
            windSpeed = apiEntity.windSpeed
        )
    }
    private fun parseTime(time: Long): String {
        return Util.formatTime("H", time)
    }
    private fun parseDay(time: Long): String {
        return Util.formatTime("E", time)
    }
    private fun parseWeatherStatus(weatherCode: Int): WeatherStatus {
        return Util.getWeatherStatus(weatherCode)
    }

    private fun parseWindDirection(windDirection: Double): String {
        return Util.getWindDirection(windDirection)
    }
}

