package com.example.weatherforecast.domain.models

data class Hourly(
    private val precipitationProbability: List<Int>,
    private val relativeHumidity: List<Int>,
    private val temperature: List<Double>,
    private val time: List<String>,
    private val weatherStatus: List<WeatherStatus>,
    private val windSpeed: List<Double>
) {
    val weatherInfo: List<HourlyWeatherInfo>
        get () {
            val hourlyWeatherInfo = mutableListOf<HourlyWeatherInfo>()
            for(i in precipitationProbability.indices) {
                hourlyWeatherInfo.add(
                    HourlyWeatherInfo(
                        precipitationProbability = precipitationProbability[i],
                        relativeHumidity = relativeHumidity[i],
                        temperature = temperature[i],
                        time = time[i],
                        weatherStatus = weatherStatus[i],
                        windSpeed = windSpeed[i]
                    )
                )
            }
            return hourlyWeatherInfo
        }

    data class HourlyWeatherInfo(
        val precipitationProbability: Int,
        val relativeHumidity: Int,
        val temperature: Double,
        val time: String,
        val weatherStatus: WeatherStatus,
        val windSpeed: Double
    )
}
