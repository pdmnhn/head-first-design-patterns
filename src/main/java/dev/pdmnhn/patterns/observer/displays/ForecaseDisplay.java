package dev.pdmnhn.patterns.observer.displays;

import dev.pdmnhn.patterns.observer.Observer;
import dev.pdmnhn.patterns.observer.weather.WeatherData;


public class ForecaseDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private float currentPressure = 29.92f;
    private float lastPressure;
    public ForecaseDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
    }

    @Override
    public void display() {
        System.out.println("Forecasting weather based on the latest measurements");
    }
}
