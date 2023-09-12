package com.example.weatherforecast.utils

import com.example.weatherforecast.domain.WeatherType

object Util {

    fun getWeatherInfo(code: Int): WeatherType {
        return when(code) {
            0 -> WeatherType.ClearSky
            1 -> WeatherType.MainlyClear
            2 -> WeatherType.PartlyCloudy
            3 -> WeatherType.Overcast
            45 -> WeatherType.Foggy
            48 -> WeatherType.DepositingRimeFog
            51 -> WeatherType.LightDrizzle
            53 -> WeatherType.ModerateDrizzle
            55 -> WeatherType.DenseDrizzle
            56 -> WeatherType.LightFreezingDrizzle
            57 -> WeatherType.DenseFreezingDrizzle
            61 -> WeatherType.SlightRain
            63 -> WeatherType.ModerateRain
            65 -> WeatherType.HeavyRain
            66 -> WeatherType.LightFreezingDrizzle
            67 -> WeatherType.HeavyFreezingRain
            71 -> WeatherType.SlightSnowFall
            73 -> WeatherType.ModerateSnowFall
            75 -> WeatherType.HeavySnowFall
            77 -> WeatherType.SnowGrains
            80 -> WeatherType.SlightRainShowers
            81 -> WeatherType.ModerateRainShowers
            82 -> WeatherType.ViolentRainShowers
            85 -> WeatherType.SlightSnowShowers
            86 -> WeatherType.HeavySnowShowers
            95 -> WeatherType.ModerateThunderstorm
            96 -> WeatherType.SlightHailThunderstorm
            99 -> WeatherType.HeavyHailThunderstorm
            else -> WeatherType.ClearSky
        }
    }
}