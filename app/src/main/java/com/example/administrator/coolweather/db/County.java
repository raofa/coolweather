package com.example.administrator.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/8/9.
 */

public class County extends DataSupport {
    private int id;
    private String countryName;
    private String weatherID;
    private int cityCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherID() {
        return weatherID;
    }

    public void setWeatherID(String weatherID) {
        this.weatherID = weatherID;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
