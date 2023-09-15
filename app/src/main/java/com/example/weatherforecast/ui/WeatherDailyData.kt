package com.example.weatherforecast.ui

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.weatherforecast.domain.models.Daily

@Composable
fun WeatherDailyData(
    state: WeatherState,
    modifier: Modifier = Modifier
) {
    state.weather.data?.daily.let { data ->
        LazyRow(modifier = modifier) {
            items(data!!.weatherInfo) {

            }

        }
    }

}

@Composable
fun WeatherDailyDataItem(
    weatherInfo: Daily.DailyWeatherInfo,
    modifier: Modifier = Modifier
) {

}