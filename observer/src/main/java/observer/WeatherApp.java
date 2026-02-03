package observer;

import model.WeatherObserver;

public class WeatherApp implements WeatherObserver {

    private double temp;

    public WeatherApp() {
        this.temp = 0;
    }

    @Override
    public void update(double num) {
        temp = num;
    }

    public void display() {
        System.out.printf("Weather App: %.2f%n", temp);
    }
}
