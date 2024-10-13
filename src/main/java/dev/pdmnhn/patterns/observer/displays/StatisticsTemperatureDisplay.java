package dev.pdmnhn.patterns.observer.displays;

import dev.pdmnhn.patterns.observer.Observer;
import dev.pdmnhn.patterns.observer.weather.WeatherData;

public class StatisticsTemperatureDisplay implements Observer, DisplayElement {
    private float minTemperature = Float.MAX_VALUE, maxTemperature = Float.MIN_VALUE;
    private final WeatherData weatherData;

    public StatisticsTemperatureDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        float currentTemperature = weatherData.getTemperature();
        minTemperature = Math.min(currentTemperature, minTemperature);
        maxTemperature = Math.max(currentTemperature, maxTemperature);
        display();
    }

    @Override
    public void display() {
        System.out.println(
                "Min Temperature: " + minTemperature + "F degrees, Max Temperature: " + maxTemperature + "F degrees");
    }
}
