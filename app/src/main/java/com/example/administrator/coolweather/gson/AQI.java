package com.example.administrator.coolweather.gson;

/**
 * Created by Administrator on 2018/8/10.
 */

public class AQI {
    public AQIcity city;

   public class AQIcity{
        public String aqi;
        public String pm25;
    }
}
