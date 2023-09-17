package com.example.weatherforecast.ui

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.weatherforecast.R
import com.example.weatherforecast.domain.repository.State

@Composable
fun WeatherHomeScreen() {
    val viewModel: WeatherViewModel = viewModel()
    val state = viewModel.state

    when(val weatherState = state.weather) {
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
            Column(
                Modifier.fillMaxSize()
            ) {
                WeatherCurrentWeatherScreen(state = state)
                WeatherDailyData(state = state)
            }
        }
        is State.Error -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_location_off),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Card {
                    Text(
                        text = weatherState.message.toString(),
                        textAlign = TextAlign.Center
                    )
                }

            }
            Log.e("MyError", "Error message: ${weatherState.message}")
        }
    }
}