package org.example.WeatherData;

import org.example.WeatherData.CurrentConditionsDisplay;
import org.example.WeatherData.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        currentConditionsDisplay.display();

    }
}



