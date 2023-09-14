package com.example.weatherforecast.ui

import android.util.Log
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
            CircularProgressIndicator(

            )
        }
        is State.Success -> {
            Text(text = "Succes")
        }
        is State.Error -> {
            Text(text = "Error")
            Log.e("MyError", "Error message: ${weatherState.message}")
        }
    }
}