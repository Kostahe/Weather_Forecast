package com.example.weatherforecast.data.api.mappers

import com.example.weatherforecast.data.api.models.ApiWeather
import com.example.weatherforecast.domain.models.Weather
import javax.inject.Inject

class ApiWeatherMapper @Inject constructor(
    private val apiDailyMapper: ApiDailyMapper,
    private val apiHourlyMapper: ApiHourlyMapper,
    private val apiCurrentWeatherMapper: ApiCurrentWeatherMapper
): ApiMapper<Weather, ApiWeather> {
    override fun mapToDomain(apiEntity: ApiWeather): Weather {
        return Weather(
            currentWeather = apiCurrentWeatherMapper.mapToDomain(apiEntity.currentWeather),
            daily = apiDailyMapper.mapToDomain(apiEntity.daily),
            hourly = apiHourlyMapper.mapToDomain(apiEntity.hourly)
        )
    }

}