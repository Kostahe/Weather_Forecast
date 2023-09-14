package com.example.weatherforecast.data.api

object ApiConstants {
    const val API_BASE_URL = "https://api.open-meteo.com/"
    const val END_POINT = "v1/forecast?hourly=precipitation_probability,relativehumidity_2m,temperature_2m,weathercode,windspeed_10m&daily=weathercode,temperature_2m_max,temperature_2m_min&current_weather=true&timeformat=unixtime&timezone=auto"
}

object ApiParameters {
    const val LATITUDE = "latitude"
    const val LONGITUDE = "longitude"
}