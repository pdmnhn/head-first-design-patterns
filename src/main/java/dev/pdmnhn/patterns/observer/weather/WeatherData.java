package dev.pdmnhn.patterns.observer.weather;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import dev.pdmnhn.patterns.observer.Observer;
import dev.pdmnhn.patterns.observer.Subject;


public class WeatherData implements Subject {
    private final Set<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = Collections.newSetFromMap(new IdentityHashMap<>());
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
