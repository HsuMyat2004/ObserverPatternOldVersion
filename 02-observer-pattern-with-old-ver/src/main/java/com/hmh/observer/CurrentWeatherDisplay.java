package com.hmh.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentWeatherDisplay implements Observer, Displayable{

	private Observable observable;
	private float temperature;
	private float pressure;
	
	public CurrentWeatherDisplay(Observable ob) {
		this.observable = ob;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData wd = (WeatherData) o;
			this.temperature = wd.getTemperature();
			this.pressure = wd.getPressure();
			display();
		}
		
	}
	
	@Override
	public void display() {
		System.out.println("Current weather is : " + temperature + " : " + pressure);
		
	}

}
