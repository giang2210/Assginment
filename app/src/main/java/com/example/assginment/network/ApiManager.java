package com.example.assginment.network;

import com.example.assginment.model.Wheather;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiManager {
    public static String BASE_URL = "https://dataservice.accuweather.com";

    @GET("/forecasts/v1/hourly/12hour/353412?apikey=GJ9yiydYrq0UarSxG2Ehf6qLdQuFlszI&language=vi-vn&metric=true")
    Call<List<Wheather>> getHour();

    @GET("/forecasts/v1/daily/5day/353412?apikey=GJ9yiydYrq0UarSxG2Ehf6qLdQuFlszI&language=vi-vn&metric=true")
    Call<List<Wheather>> getDay();
}
