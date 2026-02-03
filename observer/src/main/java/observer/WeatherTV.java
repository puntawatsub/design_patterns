package observer;

import model.WeatherObserver;

public class WeatherTV implements WeatherObserver {

    private double temp;

    public WeatherTV() {
        temp = 0;
    }

    @Override
    public void update(double num) {
        temp = num;
    }

    public void display() {
        System.out.printf("Weather TV: %.2f%n", temp);
    }
}
