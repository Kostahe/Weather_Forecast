package com.example.weatherforecast.data.di

import androidx.compose.runtime.remember
import com.example.weatherforecast.data.api.ApiConstants
import com.example.weatherforecast.data.api.WeatherApi
import com.example.weatherforecast.data.api.interceptors.LoggingInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Provides
    @Singleton
    fun provideApi(builder:Retrofit.Builder): WeatherApi {
        return builder
            .build()
            .create(WeatherApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttp: OkHttpClient): Retrofit.Builder {
        return Retrofit.Builder()
            .baseUrl(ApiConstants.API_BASE_URL)
            .client(okHttp)
            .addConverterFactory(MoshiConverterFactory.create())
    }

    @Provides
    @Singleton
    fun provideOkHttp(loggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()
    }

    @Provides
    @Singleton
    fun provideHttpLoggingInterceptor(loggingInterceptor: LoggingInterceptor): HttpLoggingInterceptor {
        val httpLoggingInterceptor = HttpLoggingInterceptor(loggingInterceptor)

        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        return httpLoggingInterceptor
    }
}