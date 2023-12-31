package com.example.weatherforecast.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherforecast.domain.location.LocationTracker
import com.example.weatherforecast.domain.repository.State
import com.example.weatherforecast.domain.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val repository: WeatherRepository,
    private val locationTracker: LocationTracker
): ViewModel() {
    var state by mutableStateOf(WeatherState())
        private set

    init {
        viewModelScope.launch {
            locationTracker.getCurrentLocation()?.let { location ->
                state = WeatherState(repository.getWeatherData(location.latitude, location.longitude))
            } ?: kotlin.run {
                state = WeatherState(State.Error("Gps not provided. Make sure to grant permission, enable GPS and make sure to have internet connection"))
            }
        }
    }
}
