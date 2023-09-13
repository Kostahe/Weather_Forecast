package com.example.weatherforecast.data.api.mappers

import com.example.weatherforecast.data.api.models.ApiHourly
import com.example.weatherforecast.domain.models.Hourly
import com.example.weatherforecast.domain.models.WeatherStatus
import com.example.weatherforecast.utils.Util
import javax.inject.Inject

class ApiHourlyMapper @Inject constructor(): ApiMapper<Hourly, ApiHourly> {
    override fun mapToDomain(apiEntity: ApiHourly): Hourly {
        return Hourly(
            precipitationProbability = apiEntity.precipitationProbability,
            relativeHumidity = apiEntity.relativeHumidity,
            temperature = apiEntity.temperature,
            time = parseTime(apiEntity.time),
            day = parseDay(apiEntity.time),
            weatherStatus = parseWeatherStatus(apiEntity.weatherCode),
            windSpeed = apiEntity.windSpeed
        )
    }

    private fun parseTime(time: List<Long>): List<String> {
        return time.map {
            Util.formatTime("H", it)
        }
    }
    private fun parseDay(time: List<Long>): List<String> {
        return time.map {
            Util.formatTime("E", it)
        }
    }

    private fun parseWeatherStatus(weatherCode: List<Int>) : List<WeatherStatus> {
        return weatherCode.map {
            Util.getWeatherStatus(it)
        }
    }
}


