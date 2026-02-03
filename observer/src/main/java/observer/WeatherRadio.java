package observer;

import model.WeatherObserver;

public class WeatherRadio implements WeatherObserver {

    private double temp;

    public WeatherRadio() {
        temp = 0;
    }

    @Override
    public void update(double num) {
        temp = num;
    }

    public void display() {
        System.out.printf("Weather Radio: %.2f%n", temp);
    }
}
