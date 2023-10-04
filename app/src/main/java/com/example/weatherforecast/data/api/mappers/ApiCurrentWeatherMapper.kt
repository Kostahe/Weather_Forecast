package com.example.weatherforecast.data.api.mappers

import com.example.weatherforecast.data.api.models.ApiCurrentWeather
import com.example.weatherforecast.domain.models.CurrentWeather
import com.example.weatherforecast.domain.models.WeatherStatus
import com.example.weatherforecast.utils.FormatUtils
import javax.inject.Inject

class ApiCurrentWeatherMapper @Inject constructor(): ApiMapper<CurrentWeather, ApiCurrentWeather>{
    override fun mapToDomain(apiEntity: ApiCurrentWeather): CurrentWeather {
        return CurrentWeather(
            temperature = apiEntity.temperature,
            time = formatTime(apiEntity.time),
            day = formatDay(apiEntity.time),
            weatherStatus = formatWeatherStatus(apiEntity.weatherCode),
            windSpeed = apiEntity.windSpeed
        )
    }
    private fun formatTime(time: Long): String {
        return FormatUtils.formatTime("H", time)
    }
    private fun formatDay(time: Long): String {
        return FormatUtils.formatTime("E", time)
    }
    private fun formatWeatherStatus(weatherCode: Int): WeatherStatus {
        return FormatUtils.getWeatherStatus(weatherCode)
    }

}

