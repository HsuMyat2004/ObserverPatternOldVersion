package com.hmh.observer;

import java.util.Observable;

public class WeatherData extends Observable{
	private float temperature;
	private float pressure;
	private float humidity;
	
	public void measurementChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float p, float h) {
		this.temperature = temp;
		this.pressure = p;
		this.humidity = h;
		measurementChanged();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getPressure() {
		return pressure;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
}
