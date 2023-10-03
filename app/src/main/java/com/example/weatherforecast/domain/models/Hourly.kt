package com.example.weatherforecast.domain.models

data class Hourly(

    private val temperature: List<Double>,
    private val time: List<String>,
    private val day: List<String>,
    private val weatherStatus: List<WeatherStatus>,
    private val windSpeed: List<Double>
) {
    val weatherInfo: List<HourlyWeatherInfo>
        get () {
            val hourlyWeatherInfo = mutableListOf<HourlyWeatherInfo>()
            for(i in temperature.indices) {
                hourlyWeatherInfo.add(
                    HourlyWeatherInfo(
                        temperature = temperature[i],
                        time = time[i],
                        day = day[i],
                        weatherStatus = weatherStatus[i],
                        windSpeed = windSpeed[i]
                    )
                )
            }
            return hourlyWeatherInfo
        }

    data class HourlyWeatherInfo(
        val temperature: Double,
        val time: String,
        val day: String,
        val weatherStatus: WeatherStatus,
        val windSpeed: Double
    )
}
