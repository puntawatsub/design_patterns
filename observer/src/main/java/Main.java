import observer.WeatherApp;
import observer.WeatherRadio;
import observer.WeatherTV;
import station.WeatherStation;

public class Main {
    public static void main(String[] args) {
        Thread mainThread = new Thread(() -> {
            Thread weatherStationThread = null;
            try {
                var weatherStation = new WeatherStation();
                var appObserver = new WeatherApp();
                var radioObserver = new WeatherRadio();
                var tvObserver = new WeatherTV();

                weatherStation.addObserver(appObserver);
                weatherStation.addObserver(radioObserver);
                weatherStation.addObserver(tvObserver);

                weatherStationThread = new Thread(weatherStation);
                weatherStationThread.start();
                for (int i = 0; i < 10; i++) {
                    System.out.println("App, Radio, and TV is observing");
                    appObserver.display();
                    radioObserver.display();
                    tvObserver.display();
                    Thread.sleep(1000);
                }
                weatherStation.removeObserver(appObserver);
                while (true) {
                    System.out.println("Radio, and TV is observing");
                    appObserver.display();
                    radioObserver.display();
                    tvObserver.display();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                return;
            } finally {
                if (weatherStationThread != null) {
                    weatherStationThread.interrupt();
                }
            }
        });
        mainThread.start();
    }
}
