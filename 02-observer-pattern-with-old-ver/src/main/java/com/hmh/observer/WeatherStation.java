package com.hmh.observer;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		
		CurrentWeatherDisplay cwd = new CurrentWeatherDisplay(wd);
		wd.setMeasurements(12.3f, 0.9f, 0.9f);
		wd.setMeasurements(17.3f, 2.9f, 1.9f);
	}
}
