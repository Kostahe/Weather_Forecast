package com.example.weatherforecast.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.weatherforecast.domain.models.Daily

@Composable
fun WeatherDailyData(
    state: WeatherState,
    modifier: Modifier = Modifier
) {
    state.weather.data?.daily?.let { data ->
        Card(modifier.padding(16.dp)) {
            LazyColumn(
                Modifier.fillMaxWidth()
            ) {
                items(data.weatherInfo) {
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
        modifier = modifier.fillMaxWidth()
            .padding(8.dp)
    ) {
        Text(text = weatherInfo.time)
        Image(
            painter = painterResource(id = weatherInfo.weatherStatus.iconRes),
            contentDescription = weatherInfo.weatherStatus.weatherDesc.toString(),
            modifier = Modifier.size(40.dp)
        )
        Text(text = "${weatherInfo.temperatureMin} - ${weatherInfo.temperatureMax}°C")
    }
}