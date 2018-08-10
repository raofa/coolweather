package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2018/8/10.
 */

public class Weather {
    public String status;//是否返回成功,成功返回OK，失败返回具体原因

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList ;
}
