package dev.pdmnhn.patterns.observer;

import dev.pdmnhn.patterns.observer.displays.CurrentConditionsDisplay;
import dev.pdmnhn.patterns.observer.displays.DisplayElement;
import dev.pdmnhn.patterns.observer.displays.StatisticsTemperatureDisplay;
import dev.pdmnhn.patterns.observer.weather.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        DisplayElement currentConditions = new CurrentConditionsDisplay(weatherData),
                statisticsTemperature = new StatisticsTemperatureDisplay(weatherData);
        weatherData.setMeasurements(100f, 40f, 0.89f);
        weatherData.setMeasurements(112f, 20f, 0.75f);
    }
}
