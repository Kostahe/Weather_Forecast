package com.example.weatherforecast.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.weatherforecast.domain.models.Daily

@Composable
fun WeatherDailyData(
    state: WeatherState,
    modifier: Modifier = Modifier
) {
    state.weather.data?.daily?.let { data ->
        Card(modifier.padding(16.dp)) {
            Column(
                Modifier.fillMaxWidth()
            ) {
                data.weatherInfo.forEach {
                    WeatherDailyItem(weatherInfo = it)
                }
            }
        }
    }
}

@Composable
fun WeatherDailyItem(
    weatherInfo: Daily.DailyWeatherInfo,
    modifier: Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Text(text = weatherInfo.time)
        Image(
            painter = painterResource(id = weatherInfo.weatherStatus.iconRes),
            contentDescription = stringResource(id = weatherInfo.weatherStatus.weatherDesc),
            modifier = Modifier.size(40.dp)
        )
        Text(text = "${weatherInfo.temperatureMin} - ${weatherInfo.temperatureMax}°C")
    }
}