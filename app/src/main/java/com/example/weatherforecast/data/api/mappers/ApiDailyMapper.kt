package com.example.weatherforecast.data.api.mappers

import com.example.weatherforecast.data.api.models.ApiDaily
import com.example.weatherforecast.domain.models.Daily
import com.example.weatherforecast.domain.models.Weather
import com.example.weatherforecast.domain.models.WeatherStatus
import com.example.weatherforecast.utils.Util
import javax.inject.Inject

class ApiDailyMapper @Inject constructor(): ApiMapper<Daily, ApiDaily>{
    override fun mapToDomain(apiEntity: ApiDaily): Daily {
        return Daily(
            temperatureMax = apiEntity.temperatureMax,
            temperatureMin = apiEntity.temperatureMin,
            time = parseTime(apiEntity.time),
            weatherStatus = parseWeatherStatus(apiEntity.weatherCode)
        )
    }

    private fun parseTime(time: List<Long>): List<String> {
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