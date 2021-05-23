import observeable.WeatherData;
import observer.CurrentConditionsDisplay;
import observer.ForecastDisplay;
import observer.Observer;

/*
The Observer Pattern defines a one-to-many dependency between objects so that when one
object changes state, all of its dependents are notified and updated automatically
* */

public class WeatherStationApp {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer currentDisplay = new CurrentConditionsDisplay(weatherData);
        Observer forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
