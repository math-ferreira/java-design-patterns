package com.bharath.patterns.adapter;

public class WeatherUI {

    public void showTemperature(int zipCOde) {
        WeatherAdapter adapter = new WeatherAdapter();
        int temperature = adapter.findTemperature(zipCOde);
        System.out.println(temperature);
    }
}
