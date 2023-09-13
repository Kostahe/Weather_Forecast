package com.example.weatherforecast.domain.location

import android.location.Location
//only for android
interface LocationTracker {
    suspend fun getCurrentLocation(): Location?
}