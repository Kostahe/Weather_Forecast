package com.example.weatherforecast.data.api.mappers

import com.example.weatherforecast.data.api.models.ApiHourly
import com.example.weatherforecast.domain.models.Hourly
import com.example.weatherforecast.domain.models.WeatherStatus
import com.example.weatherforecast.utils.FormatUtils
import javax.inject.Inject

class ApiHourlyMapper @Inject constructor(): ApiMapper<Hourly, ApiHourly> {
    override fun mapToDomain(apiEntity: ApiHourly): Hourly {
        return Hourly(
            temperature = apiEntity.temperature,
            time = parseTime(apiEntity.time),
            day = parseDay(apiEntity.time),
            weatherStatus = parseWeatherStatus(apiEntity.weatherCode),
            windSpeed = apiEntity.windSpeed
        )
    }

    private fun parseTime(time: List<Long>): List<String> {
        return time.map {
            FormatUtils.formatTime("H", it)
        }
    }
    private fun parseDay(time: List<Long>): List<String> {
        return time.map {
            FormatUtils.formatTime("E", it)
        }
    }

    private fun parseWeatherStatus(weatherCode: List<Int>) : List<WeatherStatus> {
        return weatherCode.map {
            FormatUtils.getWeatherStatus(it)
        }
    }
}


