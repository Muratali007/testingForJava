package org.example.WeatherData;

public interface Subject {
     void registerObserver(Observer o);
     void removeObserver(Observer o);
     void notifyObservers();

}
