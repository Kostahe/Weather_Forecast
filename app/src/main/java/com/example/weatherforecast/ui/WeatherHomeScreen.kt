package com.example.weatherforecast.ui

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.weatherforecast.domain.models.CurrentWeather
import com.example.weatherforecast.domain.repository.State

@Composable
fun WeatherHomeScreen() {
    val viewModel: WeatherViewModel = viewModel()
    val state = viewModel.state
    val weatherState = state.weather



    val weatherHourly = state.weather.data?.hourly?.weatherInfo ?: emptyList()
    val weatherDaily = state.weather.data?.daily?.weatherInfo ?: emptyList()
    val currentWeather = state.weather.data?.currentWeather
    when(weatherState) {
        is State.Loading -> {
            Box(
                modifier = Modifier.fillMaxSize()
            ) {
                CircularProgressIndicator(
                    modifier = Modifier.align(Alignment.Center)
                )
            }

        }
        is State.Success -> {
            Text(text = "Success")
        }
        is State.Error -> {
            Text(text = "Error")
            Log.e("MyError", "Error message: ${weatherState.message}")
        }
    }
}