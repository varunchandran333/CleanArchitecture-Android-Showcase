package com.example.data.networking.model

import com.example.domain.model.WeatherInfo

data class WeatherInfoResponse(val id: Int? = 0, val weather: List<Weather>?, val main: MainInfo?, val name: String? = "")

data class MainInfo(val temp: Double? = 0.0, val pressure: Double? = 0.0, val humidity: Int? = 0)

data class Weather(val id: Int? = 0, val main: String? = "", val description: String? = "", val icon: String? = "")

//TODO create Mapper interface and Base response class which will implement it
fun WeatherInfoResponse.mapToWeatherInfo() = WeatherInfo(main?.temp ?: 0.0, main?.humidity ?: 0, main?.pressure ?: 0.0)

