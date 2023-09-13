package com.example.weatherforecast.domain.models

data class Daily(
    private val temperatureMax: List<Double>,
    private val temperatureMin: List<Double>,
    private val time: List<String>,
    private val weatherStatus: List<WeatherStatus>
) {
    val weatherInfo: List<DailyWeatherInfo>
        get() {
            val dailyWeatherInfo = mutableListOf<DailyWeatherInfo>()
            for(i in temperatureMax.indices) {
                dailyWeatherInfo.add(
                    DailyWeatherInfo(
                        temperatureMax = temperatureMax[i],
                        temperatureMin = temperatureMin[i],
                        time = time[i],
                        weatherStatus = weatherStatus[i]
                    )
                )
            }
            return dailyWeatherInfo
        }
    data class DailyWeatherInfo(
        val temperatureMax: Double,
        val temperatureMin: Double,
        val time: String,
        val weatherStatus: WeatherStatus
    )
}
