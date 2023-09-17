package com.example.weatherforecast.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.weatherforecast.domain.models.Daily

@Composable
fun WeatherDailyData(
    state: WeatherState,
    modifier: Modifier = Modifier
) {
    state.weather.data?.daily.let { data ->
        LazyRow(modifier = modifier) {
            items(data!!.weatherInfo) {
                WeatherDailyDataItem(weatherInfo = it)
            }
        }
    }
}

@Composable
fun WeatherDailyDataItem(
    weatherInfo: Daily.DailyWeatherInfo,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = modifier.width(80.dp)
            .height(100.dp)
    ) {
        Text(
            text = weatherInfo.time,
        )
        Image(
            painter = painterResource(id = weatherInfo.weatherStatus.iconRes),
            contentDescription = stringResource(id = weatherInfo.weatherStatus.weatherDesc),
            modifier = modifier.width(40.dp)
        )
        Text(
            text = "${weatherInfo.temperatureMax}°C",
        )
    }
}