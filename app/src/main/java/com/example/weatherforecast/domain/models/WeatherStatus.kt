package com.example.weatherforecast.domain.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.res.stringResource
import com.example.weatherforecast.R

sealed class WeatherStatus(
    @StringRes val weatherDesc: Int,
    @DrawableRes val iconRes: Int
) {
    object ClearSky : WeatherStatus(
        weatherDesc = R.string.clear_sky,
        iconRes = R.drawable.ic_sunny
    )
    object MainlyClear : WeatherStatus(
        weatherDesc = R.string.mainly_clear,
        iconRes = R.drawable.ic_cloudy
    )
    object PartlyCloudy : WeatherStatus(
        weatherDesc = R.string.partly_cloudy,
        iconRes = R.drawable.ic_cloudy
    )
    object Overcast : WeatherStatus(
        weatherDesc = R.string.overcast,
        iconRes = R.drawable.ic_cloudy
    )
    object Foggy : WeatherStatus(
        weatherDesc = R.string.foggy,
        iconRes = R.drawable.ic_very_cloudy
    )
    object DepositingRimeFog : WeatherStatus(
        weatherDesc = R.string.depositing_rime_fog,
        iconRes = R.drawable.ic_very_cloudy
    )
    object LightDrizzle : WeatherStatus(
        weatherDesc = R.string.light_drizzle,
        iconRes = R.drawable.ic_rainshower
    )
    object ModerateDrizzle : WeatherStatus(
        weatherDesc = R.string.moderate_drizzle,
        iconRes = R.drawable.ic_rainshower
    )
    object DenseDrizzle : WeatherStatus(
        weatherDesc = R.string.dense_drizzle,
        iconRes = R.drawable.ic_rainshower
    )
    object LightFreezingDrizzle : WeatherStatus(
        weatherDesc = R.string.slight_freezing_drizzle,
        iconRes = R.drawable.ic_snowyrainy
    )
    object DenseFreezingDrizzle : WeatherStatus(
        weatherDesc = R.string.dense_freezing_drizzle,
        iconRes = R.drawable.ic_snowyrainy
    )
    object SlightRain : WeatherStatus(
        weatherDesc = R.string.slight_rain,
        iconRes = R.drawable.ic_rainy
    )
    object ModerateRain : WeatherStatus(
        weatherDesc = R.string.rainy,
        iconRes = R.drawable.ic_rainy
    )
    object HeavyRain : WeatherStatus(
        weatherDesc = R.string.heavy_rain,
        iconRes = R.drawable.ic_rainy
    )
    object HeavyFreezingRain: WeatherStatus(
        weatherDesc = R.string.heavy_freezing_rain,
        iconRes = R.drawable.ic_snowyrainy
    )
    object SlightSnowFall: WeatherStatus(
        weatherDesc = R.string.slight_snow_fall,
        iconRes = R.drawable.ic_snowy
    )
    object ModerateSnowFall: WeatherStatus(
        weatherDesc = R.string.moderate_snow_fall,
        iconRes = R.drawable.ic_heavysnow
    )
    object HeavySnowFall: WeatherStatus(
        weatherDesc = R.string.heavy_snow_fall,
        iconRes = R.drawable.ic_heavysnow
    )
    object SnowGrains: WeatherStatus(
        weatherDesc = R.string.snow_grains,
        iconRes = R.drawable.ic_heavysnow
    )
    object SlightRainShowers: WeatherStatus(
        weatherDesc = R.string.slight_rain_showers,
        iconRes = R.drawable.ic_rainshower
    )
    object ModerateRainShowers: WeatherStatus(
        weatherDesc = R.string.moderate_rain_showers,
        iconRes = R.drawable.ic_rainshower
    )
    object ViolentRainShowers: WeatherStatus(
        weatherDesc = R.string.violent_rain_showers,
        iconRes = R.drawable.ic_rainshower
    )
    object SlightSnowShowers: WeatherStatus(
        weatherDesc = R.string.light_snow_showers,
        iconRes = R.drawable.ic_snowy
    )
    object HeavySnowShowers: WeatherStatus(
        weatherDesc = R.string.heavy_snow_showers,
        iconRes = R.drawable.ic_snowy
    )
    object ModerateThunderstorm: WeatherStatus(
        weatherDesc = R.string.moderate_thunderstorm,
        iconRes = R.drawable.ic_thunder
    )
    object SlightHailThunderstorm: WeatherStatus(
        weatherDesc = R.string.thunderstorm_with_slight_hail,
        iconRes = R.drawable.ic_rainythunder
    )
    object HeavyHailThunderstorm: WeatherStatus(
        weatherDesc = R.string.thunderstorm_with_heavy_hail,
        iconRes = R.drawable.ic_rainythunder
    )
}