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
            time = formatTime(apiEntity.time),
            day = formatDay(apiEntity.time),
            weatherStatus = formatWeatherStatus(apiEntity.weatherCode),
            windSpeed = apiEntity.windSpeed
        )
    }

    private fun formatTime(time: List<Long>): List<String> {
        return time.map {
            FormatUtils.formatTime("H", it)
        }
    }
    private fun formatDay(time: List<Long>): List<String> {
        return time.map {
            FormatUtils.formatTime("E", it)
        }
    }

    private fun formatWeatherStatus(weatherCode: List<Int>) : List<WeatherStatus> {
        return weatherCode.map {
            FormatUtils.getWeatherStatus(it)
        }
    }
}


