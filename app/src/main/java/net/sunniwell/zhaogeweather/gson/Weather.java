package net.sunniwell.zhaogeweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by weibao on 18/8/29.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forcecast> forcecastList;

}
