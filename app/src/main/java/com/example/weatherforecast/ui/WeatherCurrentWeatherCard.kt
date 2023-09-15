package com.example.weatherforecast.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WeatherCurrentWeatherScreen(
    state: WeatherState,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.padding(16.dp)
    ) {
        state.weather.data?.currentWeather.let { data ->
            Column(
                horizontalAlignment = CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Image(
                    painter = painterResource(id = data?.weatherStatus!!.iconRes),
                    modifier = Modifier.width(200.dp),
                    contentDescription = stringResource(id = data.weatherStatus.weatherDesc)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "${data.temperature}°C",
                    fontSize = 50.sp
                )
            }
        }
    }
}