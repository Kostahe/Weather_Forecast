package com.example.weatherforecast.data.api.interceptors

import android.util.Log
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Inject

class LoggingInterceptor @Inject constructor(): HttpLoggingInterceptor.Logger {
    override fun log(message: String) {
        Log.d("LoggingInterceptor", "log: $message")
    }
}