package com.example.weatherforecast.data.repository

import com.example.weatherforecast.data.api.WeatherApi
import com.example.weatherforecast.data.api.mappers.ApiWeatherMapper
import com.example.weatherforecast.domain.models.Weather
import com.example.weatherforecast.domain.repository.State
import com.example.weatherforecast.domain.repository.WeatherRepository
import java.lang.Exception
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val weatherApi: WeatherApi,
    private val apiWeatherMapper: ApiWeatherMapper
): WeatherRepository {
    override suspend fun getWeatherData(
        latitude: Double,
        longitude: Double
    ): State<Weather> {
        return try {
            val apiWeather = weatherApi.getWeatherData(latitude, longitude)
            val weather = apiWeatherMapper.mapToDomain(apiWeather)
            State.Success(weather)
        } catch (e: Exception) {
            e.printStackTrace()
            State.Error(e.message.orEmpty())
        }
    }


}