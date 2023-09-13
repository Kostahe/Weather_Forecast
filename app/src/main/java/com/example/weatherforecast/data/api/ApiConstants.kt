package com.example.weatherforecast.data.api

object ApiConstants {
    const val API_BASE_URL = "https://api.open-meteo.com/"
    const val END_POINT = "v1/forecast?hourly=temperature_2m,weathercode&daily=weathercode,temperature_2m_max,temperature_2m_min&current_weather=true&timeformat=unixtime&timezone=auto"
}

object ApiParameters {
    const val LATITUDE = "latitude"
    const val LONGITUDE = "longitude"
}