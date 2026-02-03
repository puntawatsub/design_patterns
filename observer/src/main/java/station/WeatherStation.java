package station;

import model.WeatherObservable;
import model.WeatherObserver;

import java.util.LinkedList;
import java.util.List;

public class WeatherStation implements WeatherObservable, Runnable {

    private final List<WeatherObserver> weatherObservers;
    private double temperature = 0;

    public WeatherStation() {
        this.weatherObservers = new LinkedList<>();
    }

    @Override
    public void addObserver(WeatherObserver observer) {
        weatherObservers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        weatherObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (var observer: weatherObservers) {
            observer.update(temperature);
        }
    }


    @Override
    public void run() {
        while (true) {
            try {
                boolean shouldAdd = Math.floor(Math.random() * 10) < 5;
                if (shouldAdd) {
                    temperature += Math.random();
                } else {
                    temperature -= Math.random();
                }
                long time = (long) Math.floor((Math.random() * 5) + 1);
                notifyObservers();
                Thread.sleep(time);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
