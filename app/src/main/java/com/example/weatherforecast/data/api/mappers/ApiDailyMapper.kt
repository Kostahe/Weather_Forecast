package com.example.weatherforecast.data.api.mappers

import com.example.weatherforecast.data.api.models.ApiDaily
import com.example.weatherforecast.domain.models.Daily
import com.example.weatherforecast.domain.models.WeatherStatus
import com.example.weatherforecast.utils.FormatUtils
import javax.inject.Inject

class ApiDailyMapper @Inject constructor(): ApiMapper<Daily, ApiDaily>{
    override fun mapToDomain(apiEntity: ApiDaily): Daily {
        return Daily(
            temperatureMax = apiEntity.temperatureMax,
            temperatureMin = apiEntity.temperatureMin,
            time = formatTime(apiEntity.time),
            weatherStatus = formatWeatherStatus(apiEntity.weatherCode)
        )
    }

    private fun formatTime(time: List<Long>): List<String> {
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