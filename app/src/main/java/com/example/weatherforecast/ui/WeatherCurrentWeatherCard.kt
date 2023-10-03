package com.example.weatherforecast.ui

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.example.weatherforecast.R
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value

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
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = stringResource(id = data.weatherStatus.weatherDesc),
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row {
                    WeatherCurrentWeatherItem(
                        itemImageRes = R.drawable.ic_wind,
                        itemUnitRes = R.string.wind_speed_unit,
                        value = data.windSpeed
                    )
                }
            }
        }
    }
}

@Composable
fun WeatherCurrentWeatherItem(
    @DrawableRes itemImageRes: Int,
    @StringRes itemUnitRes: Int,
    value: Any,
    modifier: Modifier = Modifier

) {
    Row(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = itemImageRes),
            contentDescription = null,
            modifier = Modifier
                .size(24.dp)
                .padding(end = 3.dp)
        )
        Text(text = "$value ${stringResource(id = itemUnitRes)}")
    }
}